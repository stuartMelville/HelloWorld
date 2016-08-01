package com.plural.precedencetest;

/**
 * Created by stuart on 7/25/2016.
 */
public class PrecedenceTest {


    public static void main(String args[]){
        int valA =21;
        int valB =6;
        int valC =3;
        int valD =1;

        int result1 = valA -valB /valC;
        int result2 = (valA -valB) /valC;

        System.out.println("RESULT1: " +result1);
        System.out.println("RESULT2: " +result2);

        int result3 = valA /  valC * valD + valB;
        int result4 = valA /  (valC * (valD + valB));
        System.out.println("RESULT3: " +result3);
        System.out.println("RESULT4: " +result4);


    }
}
