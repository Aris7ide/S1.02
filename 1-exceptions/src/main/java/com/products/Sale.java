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

    public double calculatePrice(){

        if (this.products.isEmpty()) {
            throw new EmptySaleException("Para hacer una venta el carrito no puede estar vacio");
        }

        double sum = 0.0;

        for (Product p: this.products) {
            sum += p.getPrice();
        }

        totalPrice = sum;

        return totalPrice;

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
