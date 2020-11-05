package com.abjayon;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer,ItemsList> itemsListMap = new LinkedHashMap<>();
        itemsListMap.put(1,new ItemsList("Tea",40.0));
        itemsListMap.put(2,new ItemsList("Coffee",50.0));

        double TotalPrice = 0.0;
        boolean takeItem = true;
        while (takeItem) {
            Scanner scanner = new Scanner(System.in);
            int menuNumber = scanner.nextInt(); //System.out.println("Menu Number :");
            scanner.nextLine();
            int quantity = scanner.nextInt();//System.out.println("Quantity :");
            scanner.nextLine();
            String yes_no = scanner.nextLine();
            if (yes_no.equalsIgnoreCase("y") || yes_no.equalsIgnoreCase("n")) {
                if (itemsListMap.containsKey(menuNumber)) {
                    TotalPrice += (itemsListMap.get(menuNumber).getItemPrice() * quantity);
                } else {
                    System.out.println("No Item Found " + menuNumber);
                    takeItem = false;
                }

                if (yes_no.equalsIgnoreCase("y")) {
                   takeItem = true;
                }else if (yes_no.equalsIgnoreCase("n")){
                    takeItem = false;
                }
            } else {
                System.out.println("INVALID INPUT");
            }
        }
        System.out.println("Total Price "+TotalPrice );


    }
}

class ItemsList{
    private final String itemName;
    private final double itemPrice;

    public ItemsList(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }


}
