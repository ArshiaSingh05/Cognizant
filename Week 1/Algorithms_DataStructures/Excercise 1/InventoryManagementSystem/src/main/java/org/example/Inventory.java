package org.example;

import java.util.ArrayList;

public class Inventory {

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int productId, Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).productId == productId) {
                products.set(i, updatedProduct);
                break;
            }
        }
    }

    public void deleteProduct(int productId) {
        products.removeIf(product -> product.productId == productId);
    }
}