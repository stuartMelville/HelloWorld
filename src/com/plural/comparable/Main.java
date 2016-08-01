package com.plural.comparable;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by stuart on 7/29/2016.
 */
public class Main {
    @Test
    public void demonstrateComparableInterface(){
        TwoInts twoInts1 = new TwoInts(1,4);
        TwoInts twoInts2 = new TwoInts(1,6);
        TwoInts twoInts3 = new TwoInts(1,19);
        TwoInts twoInts4 = new TwoInts(1,1);

        TwoInts[] twoIntses = {twoInts1,twoInts2,twoInts3,twoInts4};
        for(TwoInts twoInt: twoIntses){
            System.out.println(twoInt.getInt200());
        }


        Arrays.sort(twoIntses);
        for(TwoInts twoInt: twoIntses){
            System.out.println(twoInt.getInt200());
        }
    }
}
