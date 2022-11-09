package com.java;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number to be checked palindrome or not: ");
        int numbers = num.nextInt(); 
        int reverse=0;
        // we have not mentioned the initialization part of the for loop
        for (; numbers != 0; numbers = numbers / 10) {
            int remainder = numbers % 10;
            reverse = reverse * 10 + remainder;
        }
        if(reverse == numbers){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("This is not a palindrome");
        }
    
    }
}