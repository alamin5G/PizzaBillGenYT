package com.goonok.pizza;

public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingPrice = 150;
    private int backPack = 20;
    private boolean hasToppings = false;
    private boolean hasChese = false;
    private boolean hasBackPack = false;


    public Pizza(boolean veg) {
        this.veg = veg;
        if (veg){
            this.price  = 300;
        }else {
            this.price = 400;
        }
    }

    public void addExtraCheese(){
        System.out.println("Extra Cheese Added");
        hasChese = true;
    }

    public void addExtraToppings(){
        System.out.println("Extra topping added");
        hasToppings = true;
    }

    public void takeAway(){
        System.out.println("Take Away opted");
        hasBackPack = true;
    }

    public void getBill(){
        System.out.println("Pizza Bill = " + this.price);
        int totalBill = this.price;
        if (hasToppings){
            System.out.println("Topping Bill = " + this.extraToppingPrice);
            totalBill += extraToppingPrice;
        }
        if (hasChese){
            System.out.println("Cheese Bill = " + this.extraCheesePrice);
            totalBill += extraCheesePrice;
        }
        if (hasBackPack){
            System.out.println("Package Bill = " + this.backPack);
            totalBill += backPack;
        }

        System.out.println("--------------------------------");
        System.out.println("Total Bill = " + totalBill);

    }
}
