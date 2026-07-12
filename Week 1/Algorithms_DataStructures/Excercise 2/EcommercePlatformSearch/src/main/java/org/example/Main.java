package org.example;

public class Main {

    public static void main(String[] args) {

        Product[] products = new Product[3];

        products[0] = new Product();
        products[0].productId = 1;
        products[0].productName = "Book";
        products[0].category = "Education";

        products[1] = new Product();
        products[1].productId = 2;
        products[1].productName = "Laptop";
        products[1].category = "Electronics";

        products[2] = new Product();
        products[2].productId = 3;
        products[2].productName = "Phone";
        products[2].category = "Electronics";

        Product linearResult = Search.linearSearch(products, "Laptop");

        if (linearResult != null) {
            System.out.println("Linear Search Found: " + linearResult.productName);
        }

        Product binaryResult = Search.binarySearch(products, "Laptop");

        if (binaryResult != null) {
            System.out.println("Binary Search Found: " + binaryResult.productName);
        }
    }
}