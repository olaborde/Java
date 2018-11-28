package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MenuItem menuItems = new MenuItem("Whooper", "main course", "Fat Hamburger", 2.99, true);

        String theMenuItems = "Name: "+ menuItems.getName()+ "\nCategory: "+ menuItems.getCategory()+ "\nDescription: "+ menuItems.getDescription()+" \nPrice: "+ menuItems.getPrice() ;
        System.out.println(theMenuItems);
    }
}
