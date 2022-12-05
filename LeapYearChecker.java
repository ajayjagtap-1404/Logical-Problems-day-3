package com.bridgelabz.LogicalPrograming;
import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check Leap year: ");
        int year = sc.nextInt();
        if (year > 999){
                if ((year%400 == 0 ) || (year%4 == 0 && year%100 != 0 )){
                    System.out.println(year + ": is a Leap year");
            }else {
                    System.out.println(year + ":Not a Leap year");
                }
        }else{
            System.out.println("Please inter four digit number");
        }

    }
}
