package com.bridgelabz.LogicalProgramingday5;
import  java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number You want to check:");
        number = sc.nextInt();

        if (number > 0){
            if (number % 2 == 0) {
                System.out.println(number + " :Number is Even");
            } else {
                System.out.println(number + " :Number is Odd");
            }
        }else {
            System.out.println("Enter number greater than 0");
        }

    }
}
