package com.plural.calcengine.conditional;

/**
 * Created by stuart on 7/25/2016.
 */
public class CalcEngineConditional {
    private static final char[] opCodes = {'d','a','s','m'};
    private MathEquation[] mathEquations;
    private int numberOfEquations;
    private int currentNumberOfEquations = 0;

    public CalcEngineConditional(int numberOfEquations){
        this.numberOfEquations = numberOfEquations;
        this.mathEquations = new MathEquation[numberOfEquations];
    }

    public boolean addEquation( double leftVal, double rightVal,char opcode){
        if(currentNumberOfEquations >= numberOfEquations){
            System.out.println("The max number of equations has been met");
            return false;
        }else {
            mathEquations[currentNumberOfEquations++] = new MathEquation(leftVal, rightVal, opcode);
        }
        return true;
    }

    public void loopByIfElse(){
        double[] results = new double[numberOfEquations];
        int index = 0;
        for (MathEquation mathEquation: mathEquations) {
            if (mathEquation.getOpCode() == 'a') {
                results[index] = mathEquation.getLeftVal() + mathEquation.getRightVal();
            } else if (mathEquation.getOpCode() == 's') {
                results[index] = mathEquation.getLeftVal() - mathEquation.getRightVal();
            } else if (mathEquation.getOpCode() == 'd') {
                results[index] = mathEquation.getRightVal() != 0.0d ? mathEquation.getLeftVal() / mathEquation.getRightVal() : 0.0d;
            } else if (mathEquation.getOpCode() == 'm') {
                results[index] = mathEquation.getLeftVal() * mathEquation.getRightVal();
            } else {
                System.out.println("Error - invalid opcode");
                results[index] = 0.0d;
            }
            index++;
        }
        printResults(results);
    }

    public void loopBySwitch() {
        double[] results = new double[numberOfEquations];
        int index = 0;
        for (MathEquation mathEquation: mathEquations) {
            switch (mathEquation.getOpCode()) {
                case 'a': {results[index] = mathEquation.getLeftVal() + mathEquation.getRightVal(); break;}
                case 's': {results[index] = mathEquation.getLeftVal() - mathEquation.getRightVal(); break;}
                case 'd': {results[index] = mathEquation.getRightVal() != 0.0d ? mathEquation.getLeftVal() / mathEquation.getRightVal() : 0.0d; break;}
                case 'm': {results[index] = mathEquation.getLeftVal() * mathEquation.getRightVal(); break;}
                default:  {System.out.println("Error - invalid opcode"); results[index] = 0.0d; break;}
            }
            index++;
        }
        printResults(results);
    }



    private void printResults(double[] results){
        for (double result: results) {
            System.out.println(result);
        }
    }
}
