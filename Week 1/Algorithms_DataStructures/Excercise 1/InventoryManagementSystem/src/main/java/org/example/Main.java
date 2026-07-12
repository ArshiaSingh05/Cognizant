package org.example;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product product1 = new Product();
        product1.productId = 101;
        product1.productName = "Laptop";
        product1.quantity = 10;
        product1.price = 50000;

        inventory.addProduct(product1);

        Product updatedProduct = new Product();
        updatedProduct.productId = 101;
        updatedProduct.productName = "Gaming Laptop";
        updatedProduct.quantity = 8;
        updatedProduct.price = 65000;

        inventory.updateProduct(101, updatedProduct);

        inventory.deleteProduct(101);

        System.out.println("Inventory operations completed.");
    }
}