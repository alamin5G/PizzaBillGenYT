package com.goonok;

import com.goonok.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Pizza Lover!");
        Pizza pizza = new Pizza(false);
        pizza.addExtraToppings();
        pizza.addExtraCheese();
        pizza.takeAway();
        pizza.getBill();

    }
}