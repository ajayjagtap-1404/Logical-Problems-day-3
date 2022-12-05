package com.bridgelabz.LogicalPrograming;

import java.util.Scanner;

public class PrimeFactorOfNum {
    public static void main(String[] args) {
        System.out.println("Enter a number to check prime factor:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       for (int i=2; i*i<=num; i++){
        while (num > 1){
            if (num%i == 0){
                num = num /i;
                System.out.print(" "+i);
            }else {
                i++;
            }
        }
        if (num != 1){
            System.out.println(num);
        }
       }
    }
}
