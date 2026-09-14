package com.main;

import com.exceptions.EmptySaleException;
import com.products.Product;
import com.products.Sale;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Sale> allSales = new ArrayList<>();
        double totalSales = 0.0;

        Sale venta1 = new Sale();
        //venta1.getProducts().add(new Product("Cafè", 3.50));

        try {
            venta1.calculatePrice();
            allSales.add(venta1);
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        Sale venta2= new Sale();
        venta2.getProducts().add(new Product("zumo de naranja", 5.00));
        venta2.getProducts().add(new Product("Croissant", 2.50));

        try {
            venta2.calculatePrice();
            allSales.add(venta2);
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        for (Sale s: allSales) {
            totalSales += s.getPrice();
        }

        System.out.println("Las ventas han sido " + allSales.size());
        System.out.println("El total es " + totalSales + " Euros");

        try {
            allSales.get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }

}
