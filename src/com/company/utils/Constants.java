package com.company.utils;

public class Constants {

    private static Constants constants_singleton = null;
    public String delimiter;

    private Constants() {
        delimiter = "____________________________________________________________";
    }

    public static Constants getInstance() {
        if(constants_singleton == null) {
            constants_singleton = new Constants();
        }
        return constants_singleton;
    }
}
