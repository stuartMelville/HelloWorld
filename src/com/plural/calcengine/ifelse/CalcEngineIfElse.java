package com.plural.calcengine.ifelse;

/**
 * Created by stuart on 7/25/2016.
 */
public class CalcEngineIfElse {

public static void main(String args[]){
    double val1 = 100.0d,val2 = 0.0d,result;
    char opCode = 'a';


    if(opCode == 'a') {
        result = val1 + val2;
    }
    else if(opCode == 's') {
        result = val1 - val2;
    }
    else if(opCode == 'd') {
        result = val2 != 0.0d ? val1 / val2: 0.0d;
    }
    else if(opCode == 'm') {
        result = val1 * val2;
    } else{
        System.out.println("Error - invalid opcode");
        result = 0.0d;
    }

    System.out.println(result);
}

}
