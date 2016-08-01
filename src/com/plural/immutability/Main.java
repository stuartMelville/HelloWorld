package com.plural.immutability;

import java.util.Random;

import static java.util.Random.*;

/**
 * Created by stuart on 7/25/2016.
 */
public class Main {

    public void swap(int i, int j){
        int tmp = i;
        i=j;
        j=tmp;
        System.out.println("swap val1 (int i) = " +i);
        System.out.println("swap val2 (int j) = " +j);
    }

    public void changeRandom(int i, int j){
        Random randomGenerator = new Random();
        i = (int) randomGenerator.nextInt(10);
        j = (int) randomGenerator.nextInt(10);
        System.out.println("random val1 (int i) = " +i);
        System.out.println("random val2 (int j) = " +j);

    }

    public static void main(String args[]){
        int val1 = 10;
        int val2 = 20;
        System.out.println("val1 = " + val1);
        System.out.println("val2 = " +val2);

        Main main = new Main();
        main.swap(val1,val2);
        main.changeRandom(val1,val2);

        System.out.println("val1 = " + val1);
        System.out.println("val2 = " +val2);

    }
}
