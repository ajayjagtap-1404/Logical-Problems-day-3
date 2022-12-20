package com.bridgelabz.LogicalProgramingday5;

import java.util.Scanner;

public class CoinFliper {

    public static void main(String[] args) {
            int tails = 0;
            int heads = 0;
            System.out.println("Enter the number of time to flip the coin: ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            for (int i=1;i<input;i++){
                double random = Math.random();
                if (random < 0.5){
                    System.out.println("It's Tails");
                    tails++;
                }else {
                    System.out.println("It's Heads");
                    heads++;
                }

            }
        int percentageOfHeads = (heads * 100) / input;
        int percentageOfTails = (tails * 100) / input;
        System.out.println("Percentage of Heads ::" +percentageOfHeads);
        System.out.println("Percentage of Tails ::" +percentageOfTails);

    }

}
