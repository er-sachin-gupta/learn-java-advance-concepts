package com.semanticsquare.basics;

public class CustomerOrder {

    //Variables
    static int orderNumber = 1000;
    static double price = 10.0;
    static double seniorDiscount = 2.0;
    int quantity = 1;
    boolean seniorCitizen;
    double orderAmount;

    public void generateOrderBill() {

        // Step 1: Generate New Order Number
        orderNumber = orderNumber + 1;

        // Step 2: Compute Order Amount (orderAmount) using price & quantity
        orderAmount = price * quantity;

        // Step 3: Apply discount if customer is a senior citizen
        if (seniorCitizen)
            orderAmount = orderAmount - seniorDiscount;

    }
}
