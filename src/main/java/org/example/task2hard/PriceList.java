package org.example.task2hard;

import java.sql.SQLOutput;
import java.util.HashMap;

public class PriceList {
    private HashMap<String, Double> priceList;

    public PriceList() {
        this.priceList = new HashMap<>();
    }

    public void addProduct(Product product) {
        priceList.put(product.getName(), product.getPrice());
    }

    public void changePrice(String productName, double productPrice) {
        if(priceList.containsKey(productName)) {
            priceList.put(productName, productPrice);
        } else {
            System.out.println("There is no such product in the list");
        }
    }

    public void getPriceByProductName(String name) {
        if(priceList.containsKey(name)) {
            System.out.println(priceList.get(name));
        } else {
            System.out.println("There is no such product in the list");
        }
    }

    public void printAllProducts() {
        System.out.println(priceList.toString());

    }


}

