package com.plural;

/**
 * Created by stuart on 7/25/2016.
 */
public class BlockTest {


    public static void main(String args[]){
        int v1 = 10, v2 =  4, diff;

        if (v1 > v2) {
            diff = v1-v2;
            System.out.println("v1 is bigger");
            System.out.println(diff);
        }else if (v1 < v2) {
            diff = v2-v1;
            System.out.println("v2 is bigger");
            System.out.println(diff);
        }else {
            System.out.println("v1 and v2 are equal");
        }


    }

}
