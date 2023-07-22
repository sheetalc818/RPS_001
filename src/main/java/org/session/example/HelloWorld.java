package org.session.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class HelloWorld {
    static Logger logger = LogManager.getLogger(HelloWorld.class);
    public static void main(String[] args) {
        String msg = "Hello World!!";
        int a=10;
        logger.info("Value of a = 10");
        int b=5;
        logger.info("Value of b = 5");
        int c = a+b;
        logger.info("Value of c is calculated!!");
        System.out.println("value of C : "+c);
        logger.debug(msg+ "will be printed in debug level");
        logger.info(msg+ "will be printed in info level");
        logger.error(msg + "will be printed in error level");
        logger.fatal(msg + "will be printed in fatal level");
        logger.warn(msg + "will be printed in warn level");
        logger.trace(msg + "will be printed in trace level");
        System.out.println("Hello World!!");
    }
}