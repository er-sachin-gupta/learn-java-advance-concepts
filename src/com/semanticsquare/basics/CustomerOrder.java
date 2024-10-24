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
    boolean largeDrink;

    double orderAmount = 0.0;

    public CustomerOrder(int foodChoice, int drinkChoice, int dessertChoice, String couponCode, boolean seniorCitizen, boolean largeDrink) {
        this.foodChoice = foodChoice;
        this.drinkChoice = drinkChoice;
        this.dessertChoice = dessertChoice;
        this.couponCode = couponCode;
        this.seniorCitizen = seniorCitizen;
        this.largeDrink = largeDrink;

        orderNumber = orderNumber + 1;
    }

    public CustomerOrder(int foodChoice, int drinkChoice, int dessertChoice, String couponCode, boolean largeDrink) {
        this(foodChoice, drinkChoice, dessertChoice, couponCode, false, largeDrink);
    }

    public double generateOrderBill() {

        // Your logic
        orderAmount += Menu.getMenuItemPrice(foodChoice, largeDrink);
        orderAmount += Menu.getMenuItemPrice(drinkChoice, largeDrink);
        orderAmount += Menu.getMenuItemPrice(dessertChoice, largeDrink);

        if (orderAmount > 10)
            orderAmount -= Menu.applyCoupon(couponCode);

        // Apply discount if customer is a senior citizen
        if (seniorCitizen) {
            orderAmount = orderAmount - seniorDiscount;
        }

        return orderAmount;
    }

}
