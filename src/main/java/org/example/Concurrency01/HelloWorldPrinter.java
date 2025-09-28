package org.example.Concurrency01;

public class HelloWorldPrinter implements Runnable{


    @Override
    public void run() {

        //Create the code that you want to execute from a separate method
        System.out.println("Hello World : Thread name = " + Thread.currentThread().getName());
    }
}
