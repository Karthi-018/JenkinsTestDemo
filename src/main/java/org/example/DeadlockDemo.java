package org.example;

public class DeadlockDemo {
    public static void main(String[] args) {
         final String r1="Resource1";
        final String r2 ="Resource2";

        Thread t1 = new Thread(
                ()->{
                    synchronized (r1){
                        System.out.println("Thread 1 is locked "+r1);

                        try
                        {
                            Thread.sleep(1000);
                        }
                        catch (Exception e)
                        {
                            System.out.println(e);
                        }
                        synchronized (r2)
                        {
                            System.out.println("Thread 1 is locked "+r2);
                        }
                    }

                }
        );

        Thread t2 = new Thread(
                ()->{
                    synchronized (r1){
                        System.out.println("Thread 2 is locked "+r1);
                        try
                        {
                            Thread.sleep(1000);
                        }
                        catch (Exception e)
                        {
                            System.out.println(e);
                        }
                        synchronized (r2)
                        {
                            System.out.println("Thread 2 is locked "+r2);
                        }
                    }

                }
        );

        t1.start();
        t2.start();
    }

}
