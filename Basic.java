package com.java;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int numbers = num.nextInt(); 
        int reverse = 0;
        // we have not mentioned the initialization part of the for loop
        for (; numbers != 0; numbers = numbers / 10) {
            int remainder = numbers % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}