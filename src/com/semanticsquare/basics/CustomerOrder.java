package com.semanticsquare.basics;

public class CustomerOrder {

    //Variables
    static int orderNumber = 1000;
    static double seniorDiscount = 2.0;
    int quantity = 1;
    boolean seniorCitizen;
    double orderAmount;

    public CustomerOrder(int quantity, boolean seniorCitizen) {
        this.quantity = quantity;
        this.seniorCitizen = seniorCitizen;

        // Step 1: Generate New Order Number
        orderNumber = orderNumber + 1;
    }

    public CustomerOrder(int quantity) {
        this(quantity, false);
    }

    public Double generateOrderBill() {

        // Step 2: Compute Order Amount (orderAmount) using price & quantity
        orderAmount = Menu.price * quantity;

        // Step 3: Apply discount if customer is a senior citizen
        if (seniorCitizen)
            orderAmount = orderAmount - seniorDiscount;

        return orderAmount;
    }
}
