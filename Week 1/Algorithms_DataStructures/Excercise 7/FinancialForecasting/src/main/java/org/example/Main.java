package org.example;

public class Main {

    public static void main(String[] args) {

        FinancialForecast forecast = new FinancialForecast();

        double futureValue = forecast.predictFutureValue(10000, 0.10, 5);

        System.out.println("Future Value: " + futureValue);
    }
}