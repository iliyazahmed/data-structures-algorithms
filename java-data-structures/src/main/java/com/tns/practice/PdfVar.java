package com.tns.practice;

public class PdfVar {

    private String ownerName;
    private Long contactNumber;
    private String emailAddress;

    public PdfVar() {
    }

    public PdfVar(String ownerName, Long contactNumber, String emailAddress) {
        this.ownerName = ownerName;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "PdfVar{" +
                "ownerName='" + ownerName + '\'' +
                ", contactNumber=" + contactNumber +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
