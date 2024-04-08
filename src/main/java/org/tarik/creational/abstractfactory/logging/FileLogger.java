package org.tarik.creational.abstractfactory.logging;

public class FileLogger implements LoggerBase {
    @Override
    public void log(String value) {
        System.out.println("Logged to file: " + value);
    }
}
