package com.java;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = num.nextInt();
        while (number > 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of natural number given is: " + sum);
            break;
        }

        // Reverse A Given Number
        System.out.println("Enter The number to be reversed: ");
        int reverse = num.nextInt();
        int reversed = 0;
        while (reverse != 0) {
            int digit = reverse % 10;
            reversed = reversed * 10 + digit;
            reverse /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}