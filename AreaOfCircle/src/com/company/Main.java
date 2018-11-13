package com.company;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        private static final double PI =  3.14;





        System.out.println("Please enter a number: ");
        Scanner reader = new Scanner(System.in);

        double radius = reader.nextInt();

        reader.close();

        double Area = calculateArea(radius);

        if (radius < 0) {

            System.out.println("only positive numbers are allowed");

        }

        else{
            System.out.println("The area of a circle of radius "+ radius + " is: "+ Area);


        }



    }

    private  static double calculateArea(double radius){

        return PI * radius * radius;

    }
}
