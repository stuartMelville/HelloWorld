package com.plural.finaltest;

import org.junit.Test;

/**
 * Created by stuart on 7/26/2016.
 */
public class TwoIntsTest {

    @Test
    public void twoObjectEqualsTests(){
        TwoInts twoInts1 = new TwoInts(1,1);
        TwoInts twoInts2 = new TwoInts(1,1);

        if (twoInts1 == twoInts2){
            System.out.println("They ARE equal by ==");
        } else{
            System.out.println("They are NOT equal by ==");
        }
        if (twoInts1.equals(twoInts2)){
            System.out.println("They ARE equal by .equals");
        } else{
            System.out.println("They are NOT equal by .equals");
        }


    }
    @Test
    public void twoReferenceEqualsTests(){
        TwoInts twoInts1 = new TwoInts(1,1);
        TwoInts twoInts2 = new TwoInts(1,1);
        TwoInts twoInts3 = twoInts2;

        if (twoInts1 == twoInts3){
            System.out.println("Different References to different Objects ARE equal by ==");
        } else{
            System.out.println("Different References to different Objects are NOT equal by ==");
        }
        if (twoInts1.equals(twoInts3)){
            System.out.println("Different References to different Objects ARE equal by .equals");
        } else{
            System.out.println("Different References to different Objects are NOT equal by .equals");
        }

        if (twoInts2 == twoInts3){
            System.out.println("Different References to same Objects ARE equal by ==");
        } else{
            System.out.println("Different References to same Objects are NOT equal by ==");
        }
        if (twoInts2.equals(twoInts3)){
            System.out.println("Different References to same Objects ARE equal by .equals");
        } else{
            System.out.println("Different References to same Objects are NOT equal by .equals");
        }



    }

}
