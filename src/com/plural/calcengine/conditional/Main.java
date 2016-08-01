package com.plural.calcengine.conditional;

/**
 * Created by stuart on 7/25/2016.
 */
public class Main {

    public static void main(String args[]){
//        double[] leftVals = {100.0d,25.0d,225.0d, 11.0d};
//        double[] rightVals = {50.0d,92.0d,17.0d, 3.0d};

        CalcEngineConditional calcEngineConditional = new CalcEngineConditional(4);

        calcEngineConditional.addEquation(100.0d,50.0d,'d');
        calcEngineConditional.addEquation(25.0d,92.0d,'a');
        calcEngineConditional.addEquation(225.0d,17.0d,'s');
        calcEngineConditional.addEquation(11.0d,3.0d,'m');
        calcEngineConditional.addEquation(13.0d,9.0d,'m');
        calcEngineConditional.addEquation(13.0d,9.0d,'m');
        calcEngineConditional.addEquation(13.0d,9.0d,'m');

//        calcEngineConditional.loopBySwitch(mathEquations);
        calcEngineConditional.loopByIfElse();
        calcEngineConditional.loopBySwitch();




    }

}
