package com.bridgelabz.LogicalPrograming;

import  java.util.Scanner;
public class QuotientAndRemainderFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number/Dividend :");
        int dividend = sc.nextInt();

        System.out.println("Enter 2nd number/Divisor : ");
        int divisor = sc.nextInt();

        int quotient = (dividend / divisor);
        int remainder= (dividend % divisor);

        System.out.println("Quotient is ="+quotient);
        System.out.println("Remainder is ="+remainder);
    }
}
