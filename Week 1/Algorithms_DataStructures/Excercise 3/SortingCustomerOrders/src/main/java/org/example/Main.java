package org.example;

public class Main {

    public static void main(String[] args) {

        Order[] orders = new Order[3];

        orders[0] = new Order();
        orders[0].orderId = 101;
        orders[0].customerName = "Arshia";
        orders[0].totalPrice = 1500;

        orders[1] = new Order();
        orders[1].orderId = 102;
        orders[1].customerName = "Radha";
        orders[1].totalPrice = 700;

        orders[2] = new Order();
        orders[2].orderId = 103;
        orders[2].customerName = "Ram";
        orders[2].totalPrice = 2500;

        SortOrders.bubbleSort(orders);

        System.out.println("Bubble Sort:");

        for (Order order : orders) {
            System.out.println(order.customerName + " - " + order.totalPrice);
        }

        SortOrders.quickSort(orders, 0, orders.length - 1);

        System.out.println();

        System.out.println("Quick Sort:");

        for (Order order : orders) {
            System.out.println(order.customerName + " - " + order.totalPrice);
        }
    }
}