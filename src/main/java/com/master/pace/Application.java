package com.master.pace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.master.pace.model")
public class Application {

    private static final String LOG4J_CONFIGURATION_FILE = "configuration/log4j.xml";
    private static final String LOG_DIR = ".";

    static {
        System.setProperty("log4j.configuration", LOG4J_CONFIGURATION_FILE);
        System.setProperty("LOG_DIR", LOG_DIR);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}