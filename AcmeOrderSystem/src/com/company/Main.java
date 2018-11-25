package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Test MyDate
        MyDate date1 = new MyDate(11,11,1918);
        MyDate date2 = new MyDate();
        date2.day = 11;
        date2.month = 11;
        date2.year = 1918;
        MyDate date3 = new MyDate();
        date3.setDate(4,21,1968);
        String str1 = date1.toString();
        String str2 = date2.toString();
        String str3 = date3.toString();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);



        // TestOrders
        MyDate date31 = new MyDate(1,20,2008);
        Order anvil = new Order(date31, 2000.00, "Wile E Coyote", "Anvil", 10);

        MyDate date4 = new MyDate(4,10,2008);
        Order balloons = new Order(date4, 1000.00, "Bugs Bunny", "Balloon", 125);

        System.out.println(anvil);
        System.out.println(balloons);

    }
}
