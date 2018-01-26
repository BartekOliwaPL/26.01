package com.infoshare;

public class Fraction {

    private int counter;
    private int denominator;
    public double value;

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    public void value() {
        value = (double) counter / denominator;
        System.out.println(value);
        System.out.println(counter + "/" + denominator);

    }
}

