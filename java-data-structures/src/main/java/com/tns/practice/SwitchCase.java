package com.tns.practice;


import java.util.logging.Logger;



public class SwitchCase {
    public static final String RAJDHANI = "Rajdhani Express";
    static Logger logger = Logger.getLogger(SwitchCase.class.getName());
    public static void main(String[] args) {
        Train train = new Train();
        train.setTrainName(RAJDHANI);
        train.setPrice(3000.93);
        train.setSource("Hyderabad");
        train.setDestination("Bengaluru");

        String request = train.getTrainName()!= null? train.getSource() : train.getTrainName();
        switch (request){
            case RAJDHANI :
                logger.info(RAJDHANI);
                break;
            case "Dakshin" :
                logger.info("Dakshin");
                break;
            case "Turnto":
                logger.info("Turunto");
                break;
            default:
                logger.info("No Train");
                break;
        }
    }
}
