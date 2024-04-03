package org.tarik.creational.signleton;

import java.util.Random;

public class DatabaseContext {
    private  volatile static DatabaseContext instance;
    private String name;

    public void connect() {
        System.out.println("Connected to " + name);
    }
    private DatabaseContext(String name) {
        try {
            Random random = new Random();
            int randomMs = random.nextInt(4001);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.name = name;
    }

    public static DatabaseContext getInstance(String name) {
        DatabaseContext context = instance;
        if (context != null) return context;
        synchronized (DatabaseContext.class) {
            if (instance == null) {
                instance = new DatabaseContext(name);
            }
            return instance;
        }

    }


}
