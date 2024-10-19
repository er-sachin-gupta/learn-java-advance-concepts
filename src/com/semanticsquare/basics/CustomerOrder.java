package com.semanticsquare.basics;

public class CustomerOrder {
    static int orderNumber = 1000;

    static double seniorDiscount = 2.0;

    // Variables that define a customer's order
    int foodChoice;
    int drinkChoice;
    int dessertChoice;
    String couponCode;
    boolean seniorCitizen;

    double orderAmount = 0.0;

    public CustomerOrder(int foodChoice, int drinkChoice, int dessertChoice, String couponCode, boolean seniorCitizen) {
        this.foodChoice = foodChoice;
        this.drinkChoice = drinkChoice;
        this.dessertChoice = dessertChoice;
        this.couponCode = couponCode;
        this.seniorCitizen = seniorCitizen;

        orderNumber = orderNumber + 1;
    }

    public CustomerOrder(int foodChoice, int drinkChoice, int dessertChoice, String couponCode) {
        this(foodChoice, drinkChoice, dessertChoice, couponCode, false);
    }

    public double generateOrderBill() {

        // Your logic
        orderAmount += Menu.getMenuItemPrice(foodChoice);
        orderAmount += Menu.getMenuItemPrice(drinkChoice);
        orderAmount += Menu.getMenuItemPrice(dessertChoice);

        if (orderAmount > 10)
            orderAmount -= Menu.applyCoupon(couponCode);

        // Apply discount if customer is a senior citizen
        if (seniorCitizen) {
            orderAmount = orderAmount - seniorDiscount;
        }

        return orderAmount;
    }

}
