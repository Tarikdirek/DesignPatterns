package org.tarik.creational.abstractfactory.logging;

public class DatabaseLogger implements LoggerBase {
    @Override
    public void log(String value) {
        System.out.println("Logged to database: " + value);
    }
}
