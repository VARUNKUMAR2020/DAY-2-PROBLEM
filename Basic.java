package com.java;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = num.nextInt();
        while (number > 0) {
            int sum = number*(number+1)/2;
            System.out.println("The sum of natural number given is: " +sum);
            break;
        }
    }
}