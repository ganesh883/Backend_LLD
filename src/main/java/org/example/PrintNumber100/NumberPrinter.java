package org.example.PrintNumber100;

public class NumberPrinter implements Runnable{

    private int numberToPrint;

    public NumberPrinter(int numberToPrint){
        this.numberToPrint = numberToPrint;
    }

    public void run(){
        System.out.println(numberToPrint+" - Printed By "+ Thread.currentThread().getName() );
    }

}
