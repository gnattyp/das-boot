package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * with spring boot we will run this app as a regular old java application
 * by adding @SpringBootApplication it will scan the app from spring annotations
 * and autowire most of the components we will want to use by enableing autoconfiguration
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        //fires up spring boot when our public static void main method is run as a pure java application
    	SpringApplication.run(App.class, args);
    }
}
