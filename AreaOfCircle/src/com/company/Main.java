package com.company;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {




        System.out.println("Please enter a number: ");
        Scanner reader = new Scanner(System.in);

        double radius = reader.nextInt();

        reader.close();





        if (radius < 0) {

            System.out.println("only positive numbers are allowed");

        }

        else{
            double Area = calculateArea(radius);
            System.out.println("The area of a circle of radius "+ radius + " is: "+ Area);


        }


    }

    public static double calculateArea(double radius) {
        final double PI =  3.14;
        return PI * radius * radius;
    }


}
