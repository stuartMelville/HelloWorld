package com.pluralsight.calcengine.interfaces.com.pluralsight.calcengine;

/**
 * Created by stuart on 7/29/2016.
 */
public class PowerOf implements MathProcessing {
    @Override
    public String getKeyWord() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal,rightVal);
    }
}
