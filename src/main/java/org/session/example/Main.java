package org.session.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        System.out.println("Hello world!");
        logger.info("will be printed in debug level");

        double res1 = (Math.pow(2,2));
        System.out.println("Result1 : "+res1);
        double res2 = (Math.pow(3,2));
        System.out.println("Result2 : "+res2);
        double result = Math.sqrt(res1+res2);
        System.out.println("Result : "+result);
    }
}