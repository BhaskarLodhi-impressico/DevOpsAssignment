package com.bhaskarlodhi.model;

public class FibonacciSeries
{
    private int firstNumber;

    private int secondNumber;

    public FibonacciSeries() {
    }

    public FibonacciSeries(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
