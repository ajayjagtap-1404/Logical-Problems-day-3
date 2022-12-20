package com.bridgelabz.LogicalProgramingday5;
import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Enter 1st number :");

        System.out.println("Enter 2nd number:");
        y = sc.nextInt();

        System.out.println("Before Swapping numbers are: "+x+" "+y);

        z = x;
        x = y;
        y = z;
        System.out.println();
        System.out.println("After Swapping numbers are: "+x+" "+y);


    }
}
