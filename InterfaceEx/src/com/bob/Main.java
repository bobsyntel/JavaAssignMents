package com.bob;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("To choose a restaurant , please enter 'sitdown' or 'casual' :");
        Scanner restaurantOptions = new Scanner(System.in);
        String restaurant = restaurantOptions.nextLine();
        if(restaurant.equals("sitdown")){
            Sitdown sitdown = new Sitdown();
           // System.out.println("You can choose from our menu options :");
            sitdown.displayMenu();
            String order = restaurantOptions.nextLine();
            String[] customerOrder = order.split(",");
            sitdown.calculateOrder(customerOrder);
            System.out.println("Your total is :"+sitdown.getTotalAmtToBePaid());
            System.out.println("you can add a tip :");
            Double tip = restaurantOptions.nextDouble();
            sitdown.addTipToTotal(tip);
            System.out.println("Your new total is :"+sitdown.getTotalAmtToBePaid());
            System.out.println("You can pay now : ");
            Double pay = restaurantOptions.nextDouble();
           //;
            System.out.println("Your change is :"+ sitdown.payBill(pay));
            System.out.println("Thank you for visiting sitdown ");

        }else  if(restaurant.equals("casual")){

        }else{
            System.out.println("please enter  casual or sitdown:");
        }

    }
}
