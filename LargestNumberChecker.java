package com.bridgelabz.LogicalPrograming;
import java.util.Scanner;

public class LargestNumberChecker {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number:");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        num2 = sc.nextInt();
        System.out.println("Enter 3rd number:");
        num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println("Greater number is : "+num1);

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Greater number is : "+num2);


        }else {
            System.out.println("Greater number is : "+num3);
        }

    }
}
