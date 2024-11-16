package com.semanticsquare.basics;

public class CafeOrderProcessor {

    String name = "Duke's Coffee Hut";

    public static void main(String[] args) {
        {
            // Non-senior Citizen ordering Pizza (1), Coffee (8), and Cake (9)
            CustomerOrder customerOrder1 = new CustomerOrder(1, 8, 9, "HAPPYHOUR", true);
            double orderAmount1 = customerOrder1.generateOrderBill();

            System.out.println("Order Number: " + CustomerOrder.orderNumber);
            System.out.println("Total Amount: " + orderAmount1);
        }

        // Non-senior Citizen ordering Pizza (1), Coffee (8), and Cake (9)
        CustomerOrder customerOrder1 = new CustomerOrder(1, 8, 9, "HAPPYHOUR", true);
        double orderAmount1 = customerOrder1.generateOrderBill();

        System.out.println("Order Number: " + CustomerOrder.orderNumber);
        System.out.println("Total Amount: " + orderAmount1);

        // Senior citizen
        CustomerOrder customerOrder2 = new CustomerOrder(1, 8, 9, "HAPPYHOUR", false);
        double orderAmount2 = customerOrder2.generateOrderBill();

        System.out.println("\nOrder Number: " + CustomerOrder.orderNumber);
        System.out.println("Total Amount: " + orderAmount2);

    }
}
