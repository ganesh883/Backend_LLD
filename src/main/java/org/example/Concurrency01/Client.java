package org.example.Concurrency01;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello" + Thread.currentThread().getName());


        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        Thread thread1 = new Thread(helloWorldPrinter);
        thread1.start();

        System.out.println("Hello" + Thread.currentThread().getName());
    }


    /*

    Task: Print Hello World from a new thread

    1. Create a Task
         -> Create a Task Class
         -> Make this class implements Runnable Interface
         -> Implement the Run() Method
    2. Create a Thread
         -> Create Thread Object
    3. Assign the task to the thread
         -> Pass task object inside the constructor of thread class
    4. Start the Thread
         -> Thread.start();
     */
}
