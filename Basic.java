package com.java;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter The Single Digit Number: ");
        int number = num.nextInt();
        if (number >= 10) {
            System.out.println("Enter The Valid Number");
        } else {
            if (number == 0) {
                System.out.println("ZERO");
            }
            if (number == 1) {
                System.out.println("ONE");
            }
            if (number == 2) {
                System.out.println("TWO");
            }
            if (number == 3) {
                System.out.println("THREE");
            }
            if (number == 4) {
                System.out.println("FOUR");
            }
            if (number == 5) {
                System.out.println("FIVE");
            }
            if (number == 6) {
                System.out.println("SIX");
            }
            if (number == 7) {
                System.out.println("SEVEN");
            }
            if (number == 8) {
                System.out.println("EIGHT");
            }
            if (number == 9) {
                System.out.println("NINE");
            }
        }
        
        //Range of the numbers:
        System.out.println("Enter The Number To Find Units: ");
        int range = num.nextInt();
        if(range >= 1 && range <=9){
            System.err.println("Range is Units");
        }
        if(range >=10 && range <=99){
            System.out.println("Range is Tens");
        }
        if(range >=100 && range <=999){
            System.out.println("Range is Hundreds");
        }
        if(range >=1000 && range <=9999){
            System.out.println("Range is Thousands");
        }


    }
}
