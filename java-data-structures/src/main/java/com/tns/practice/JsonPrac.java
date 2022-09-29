
package com.tns.practice;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

public class JsonPrac {
    public static void main(String[] args) {
        System.out.println(createJsonWebToken("College","MayuraTech Pvt ltd.","college@fileracks.com",1663156095));
    }


    public static String createJsonWebToken(String userName, String issuer, String subject, long ttlMillis) {

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        //We will sign our JWT with our ApiKey secret
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary("Test");
        System.out.println("ApI "+apiKeySecretBytes);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, SignatureAlgorithm.HS256.getJcaName());
        System.out.println("signingKey "+signingKey);
        //Let's set the JWT Claims
        JwtBuilder builder = Jwts.builder().setId(userName)

                .setIssuedAt(now)

                .setSubject(subject)

                .setIssuer(issuer)

                .signWith(SignatureAlgorithm.HS256, signingKey);
        System.out.println(builder.toString());
        //if it has been specified, let's add the expiration
        if (ttlMillis >= 0) {

            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }



        //Builds the JWT and serializes it to a compact, URL-safe string
        System.out.println("Token Generated ==>");
        return "Bearer " + builder.compact();
    }
}


