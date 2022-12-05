package com.bridgelabz.LogicalPrograming;
import java.util.Scanner;

public class PowersOfTwos {
    static int total;
    public static void main(String[] args) {
        System.out.println("Enter power of twos");
        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();

        for (int i=0; i<=power; i++){
             total = (int) Math.pow(2, i);
            System.out.print(" "+total);

        }
    }
}

