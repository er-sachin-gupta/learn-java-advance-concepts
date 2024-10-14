package com.semanticsquare.basics;

public class CafeOrderProcessor {

    String name = "Duke's Coffee Hut";

    public static void main(String[] args) {
        // First Order (Creating object)
        CustomerOrder order1 = new CustomerOrder(2, true);

        // Computing order amount for order1
        double orderAmount = order1.generateOrderBill();

        // Bill Generation
        System.out.println("Order Number: " + CustomerOrder.orderNumber);
        System.out.println("Quantity: " + order1.quantity);
        System.out.println("Total Amount: " + orderAmount);


        // Second Order (Creating object)
        CustomerOrder order2 = new CustomerOrder(3);

        // Computing order amount for order2
        orderAmount = order2.generateOrderBill();

        // Bill Generation
        System.out.println("\nOrder Number: " + CustomerOrder.orderNumber);
        System.out.println("Quantity: " + order2.quantity);
        System.out.println("Total Amount: " + orderAmount);

        // Third Order (Creating object)
        CustomerOrder order3 = new CustomerOrder(1,true);
        // Computing order amount for order3
        orderAmount = order3.generateOrderBill();

        // Bill Generation
        System.out.println("\nOrder Number: " + CustomerOrder.orderNumber);
        System.out.println("Quantity: " + order3.quantity);
        System.out.println("Total Amount: " + orderAmount);
    }

}
