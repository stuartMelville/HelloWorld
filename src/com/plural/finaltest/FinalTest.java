package com.plural.finaltest;

public class FinalTest {

    public void testFinalLiteral(final String finalString, final int finalInt1, final int finalInt2){
        String bob = "BOB";
//        finalString = bob;
        int tempInt = 3;
//        finalInt1 = tempInt;
    }

    public void testFinalObject(final TwoInts twoInts){
        twoInts.setInt100(1100);
        twoInts.setInt200(1200);
//        twoInts = new TwoInts(9,8);
    }

    public static void main(String[] args) {
        String staticString = "String";
        int staticInt1 = 1;
        int staticInt2 = 2;
        System.out.println("staticString Before: " + staticString);
        System.out.println("staticInt Before: " + staticInt1);

        FinalTest mainTest = new FinalTest();
        mainTest.testFinalLiteral(staticString, staticInt1,staticInt2);
        TwoInts twoIntsTest = new TwoInts(staticInt1,staticInt2);
        System.out.println("TwoInts Int100 Before: " + twoIntsTest.getInt100());
        System.out.println("TwoInts Int200 Before: " + twoIntsTest.getInt200());

        mainTest.testFinalObject(twoIntsTest);
        System.out.println("staticString After: " + staticString);
        System.out.println("staticInt After: " + staticInt1);
        System.out.println("TwoInts Int100 After: " + twoIntsTest.getInt100());
        System.out.println("TwoInts Int200 After: " + twoIntsTest.getInt200());

    }
}

