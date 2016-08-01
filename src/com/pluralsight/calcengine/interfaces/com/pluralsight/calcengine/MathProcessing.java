package com.pluralsight.calcengine.interfaces.com.pluralsight.calcengine;

/**
 * Created by stuart on 7/29/2016.
 */
public interface MathProcessing {

    String SEPERATOR = " ";
    String getKeyWord();  //Add
    char getSymbol();  //+
    double doCalculation(double leftVal, double rightVal);
}
