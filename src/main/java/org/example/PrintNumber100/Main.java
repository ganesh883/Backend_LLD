package org.example.PrintNumber100;

public class Main {
    public static void main(String[] args) {


        for(int i=1;i<=100;i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            t.start();
        }
    }
}
