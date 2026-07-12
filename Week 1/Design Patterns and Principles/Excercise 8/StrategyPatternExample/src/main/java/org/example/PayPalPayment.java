package org.example;

public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Payment made using PayPal.");
    }
}