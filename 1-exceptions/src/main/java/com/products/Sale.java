package com.products;

import com.exceptions.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public String calculatePrice() {

        if (!products.isEmpty()) {
            for (Product p : products) {
                totalPrice += p.getPrice();
            }

            return "El total de la venta es " + totalPrice;

        } else {
            throw new EmptySaleException();
        }

    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getPrice() {
        return totalPrice;
    }

    public void setPrice(double price) {
        this.totalPrice = price;
    }

}

