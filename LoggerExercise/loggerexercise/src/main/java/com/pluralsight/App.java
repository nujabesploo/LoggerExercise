package com.pluralsight;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    final static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logMeLikeYouDo("☕");
    }

    private static void logMeLikeYouDo(String input) {
        logger.log(Level.FINE, "This is debug : " + input);
        logger.log(Level.INFO, "This is info : " + input);
        logger.log(Level.WARNING, "This is warn : " + input);
        logger.log(Level.SEVERE, "This is error : " + input);
        logger.log(Level.SEVERE, "This is fatal : " + input);
    }

}