package com.bob;

import java.util.HashMap;
import java.util.Map;

public class Sitdown implements PayableWithTip {
   private  double total = 0;
    private Map<String, Double> menu;
    public Sitdown(){
        menu = new HashMap<String, Double>();

        menu.put("Steak", 10.00d );
        menu.put("Mac and Cheese", 2.50d );
        menu.put("Potatoes", 3.00d );
        menu.put("Drink", 1.50d );
    }

    public void displayMenu(){
        System.out.println("Please select from the menu below and place an order :");
        for (Map.Entry<String,Double> entry :menu.entrySet()) {
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }

    }
    public void calculateOrder(String [] order){
      //  double total = 0;
        for(int i = 0; i < order.length;i++){
            total+=menu.get(order[i]);
        }


    }

    public void addTipToTotal(double tipAmt){
         total += tipAmt;
        //System.out.println("Total amount after tip :"+total);
    };
    public double getTotalAmtToBePaid(){
        return  total;
    }

    public double payBill(double Amt){
         double change  = Amt - total;
        return  change;
    }


}
