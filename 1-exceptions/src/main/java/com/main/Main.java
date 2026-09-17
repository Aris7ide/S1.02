package com.main;

import com.exceptions.EmptySaleException;
import com.products.Product;
import com.products.Sale;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sale venta1 = new Sale();

        try {
            System.out.println(venta1.calculatePrice());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        Sale venta2 = new Sale();
        venta2.getProducts().add(new Product("zumo de naranja", 5.00));
        venta2.getProducts().add(new Product("Croissant", 2.50));

        try {
            System.out.println(venta2.calculatePrice());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        Sale venta3 = new Sale();
        venta3.getProducts().add(new Product("zumo natural", 6.00));
        venta3.getProducts().add(new Product("Coca-cola", 3.50));

        try {
            System.out.println(venta3.calculatePrice());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }



        try {
            venta2.getProducts().get(6);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }

}
