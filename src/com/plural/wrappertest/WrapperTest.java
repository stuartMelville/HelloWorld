package com.plural.wrappertest;


import java.io.IOException;

/**
 * Created by stuart on 7/26/2016.
 */
public class WrapperTest {

    public static void main(String args[]) {
        Long wL1 = new Long(100);
        Long wL2 = 100l;
        Long wL3 = wL1;
        Long wL4 = wL2;

        long l1 = wL1;
        long l2 = wL2.longValue();
        Long wL5 = Long.valueOf(l2);
        Long wL6 = l2;
        Long wL7 = Long.parseLong("123456");

        if (wL1 == wL2) {
            System.out.println("wL1 is == to wL2");
        } else {
            System.out.println("wL1 is NOT == to wL2");
        }
        if (wL1.equals(wL2)) {
            System.out.println("wL1 is .equals to wL2");
        } else {
            System.out.println("wL1 is NOT .equals to wL2");
        }

        Integer iW1 = 100;                      //Goes into in Constant Pool
        Integer iW2 = new Integer(100);         //NOT in Constant Pool
        Integer iW3 = iW1;                      //Goes into in Constant Pool
        Integer iW4 = Integer.valueOf(100);     //Goes into in Constant Pool
        Integer iW5 = Integer.parseInt("100");  //Goes into in Constant Pool
        int i1 = 100;                           //Not an Object
        Integer iW6 = Integer.valueOf(i1);      //Goes into in Constant Pool
    }

    public void throwsTest() throws IOException {

    }
}
