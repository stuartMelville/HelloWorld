package com.plural.stringtest;

/**
 * Created by stuart on 7/26/2016.
 */


public class StringTest {
    public static void main(String args[]){
//    equalsTest();
//        reverseStringUsingStringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        reverseStringUsingForLoop("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }

    private static void reverseStringUsingStringBuffer(String input){
        String reverse;
        StringBuilder reverseThatString = new StringBuilder(input);
        reverse = reverseThatString.toString();
        System.out.println(reverse);
        reverse = reverseThatString.reverse().toString();
        System.out.println(reverse);
    }
    private static void reverseStringUsingForLoop(String input){
        char[] inputCharArray = input.toCharArray();
        System.out.println(String.valueOf(inputCharArray));
        char[] reverseCharArray =  new char[inputCharArray.length];
        int y = 0;
        for (int i =inputCharArray.length-1 ;i>=0;i--){
            reverseCharArray[y++] = inputCharArray[i];
        }
        System.out.println(String.valueOf(reverseCharArray));
    }


    private static void equalsTest(){
        String s1 = "I Love";
        s1 += " Java";

        String s2 = "I";
        s2 += " Love Java";

        if (s1==s2){
            System.out.println("s1 is == to s2");
        } else {
            System.out.println("s1 is NOT == to s2");
        }
        if (s1.equals(s2)){
            System.out.println("s1 is .equals to s2");
        } else {
            System.out.println("s1 is NOT .equals to s2");
        }

        String s3 = s1.intern();
        String s4 = s2.intern();
        if (s3==s4){
            System.out.println("s3 is == to s4");
        } else {
            System.out.println("s3 is NOT == to s4");
        }
        if (s3.equals(s4)){
            System.out.println("s3 is .equals to s4");
        } else {
            System.out.println("s3 is NOT .equals to s4");
        }
        String bob = "BOB";
        String cat = "BOB";
        String dog = new String("BOBBOB");
        String rat = new String("BOBBOB");
        String cow = bob + cat;



        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("I ");
        stringBuilder1.append("AM ");
        stringBuilder1.append("BOB.");
        String s5 = stringBuilder1.toString().intern();

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("I ");
        stringBuilder2.append("AM ");
        stringBuilder2.append("BOB.");
        String s6 = stringBuilder2.toString().intern();

    }

}
