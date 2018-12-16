package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter and ending number");

        int endingNumber = sc.nextInt();

        for (int i = 1; i <= endingNumber; i++){

            // Call the recursive method
            System.out.printf("%d! = %d\n", i, factorial(i));

        }
    }


    private static int factorial(int aNum){
        if ( aNum <= 1){
            return aNum;
        }
        else {
            return aNum * factorial(aNum - 1);
        }
    }
}
