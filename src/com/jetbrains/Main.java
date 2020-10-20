package com.jetbrains;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Product> productList = new ArrayList<>();
    private double totalCartValue;

    public int getProductCount() {
        return productList.size();
    }

    public void addProduct(Product product) {
        //implement
    }

    public double getTotalCartValue() {
        //implement
        return totalCartValue;
    }

    public Product getProductByName(String name) {
        if (productList.size() > 0) {
            productList.stream().filter(product -> product.getName().equals(name)).findFirst().get();
        }
        return null;
    }
}
