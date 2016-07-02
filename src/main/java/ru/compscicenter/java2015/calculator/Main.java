package ru.compscicenter.java2015.calculator;

public final class Main {
    private Main() {

    }
    public static void main(final String[] args) {
        double result = new SimpleCalculator().calculate("-10 ^ 2");
        System.out.println(result);
    }
}

