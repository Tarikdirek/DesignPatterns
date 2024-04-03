package org.tarik.creational.signleton;

public class Main {
    public static void main(String[] args) {
       /* DatabaseContext db1 = new DatabaseContext("db1");
        db1.connect();
        System.out.println(db1);

        DatabaseContext db2 = new DatabaseContext("db2");
        db2.connect();
        System.out.println(db2); */

        /*DatabaseContext db3 = DatabaseContext.getInstance("db3");
        db3.connect();

        DatabaseContext db4 = DatabaseContext.getInstance("db4");
        db4.connect(); */


        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());

        thread1.start();
        thread2.start();
    }

    static class ThreadOne implements Runnable{
        @Override
        public void run() {
            DatabaseContext dbContext = DatabaseContext.getInstance("thread 1");
            System.out.println(dbContext);
            dbContext.connect();
        }
    }

    static class ThreadTwo implements Runnable{
        @Override
        public void run() {
            DatabaseContext dbContext = DatabaseContext.getInstance("thread 2");
            System.out.println(dbContext);
            dbContext.connect();
        }
    }
}
