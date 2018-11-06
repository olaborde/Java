package com.company;
import java.util.Scanner;


public class Main {




    public static void main(String[] args) {
        float pi =  3.14f;

        float r;

        float A;

        System.out.println("Please enter a number: ");
        Scanner reader = new Scanner(System.in);

        r = reader.nextInt();

        reader.close();

        A = pi * r * r;

        if (r < 0) {

            System.out.println("only positive numbers are allowed");

        }

        else{
            System.out.println("The area of a circle of radius "+ r + " is: "+ A);


        }






    }
}
