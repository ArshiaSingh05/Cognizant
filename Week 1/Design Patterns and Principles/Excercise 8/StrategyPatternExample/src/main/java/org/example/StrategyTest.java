package org.example;

public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext creditCard = new PaymentContext(new CreditCardPayment());
        creditCard.executePayment();

        PaymentContext payPal = new PaymentContext(new PayPalPayment());
        payPal.executePayment();
    }
}