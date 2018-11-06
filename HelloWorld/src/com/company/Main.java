package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello, Osse!");
        System.out.println(2+5);


        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter your name:");

        String name = reader.next();

        reader.close();

        System.out.println("Hello, "+ name);


  }

}

