package com.plural.calcengine.conditional;

/**
 * Created by stuart on 7/25/2016.
 */
public class MathEquation {


    private double leftVal;
    private double rightVal;
    private char opCode;

    public MathEquation(double leftVal,double rigthVal, char opCode){
        this.leftVal = leftVal;
        this.rightVal = rigthVal;
        this.opCode = opCode;
    }

    public double getLeftVal() { return leftVal; }
    public double getRightVal() { return rightVal; }
    public char getOpCode() { return opCode; }
}
