package com.products;

import com.exceptions.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products;
    private double price;

    public Sale(List<Product> products) {
        this.products = new ArrayList<>();
    }

    public double calculatePrice() throws EmptySaleException {

        if (this.products.isEmpty()) {
            throw new EmptySaleException("Para hacer una venta el carrito no puede estar vacio");
        }

        double sum = 0.0;

        for (Product p: this.products) {
            sum += p.getPrice();
        }

        return sum;

    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
