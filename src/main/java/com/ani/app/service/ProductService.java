package com.ani.app.service;

import java.util.ArrayList;
import com.ani.app.model.Product;

public class ProductService {

    ArrayList<Product> list = new ArrayList<>();

    public void add(Product p) {
        list.add(p);
    }

    // 1. Total number of products
    public void totalProducts() {
        System.out.println("Total products: " + list.size());
    }

    // 2. Total units
    public void totalUnits() {
        int sum = 0;
        for (Product p : list) {
            sum += p.getQty();
        }
        System.out.println("Total units: " + sum);
    }

    // 3. Total value
    public void totalValue() {
        double total = 0;
        for (Product p : list) {
            total += p.getPrice() * p.getQty();
        }
        System.out.println("Total value: " + total);
    }

    // 4. Most expensive product
    public void mostExpensive() {
        Product max = list.get(0);
        for (Product p : list) {
            if (p.getPrice() > max.getPrice()) {
                max = p;
            }
        }
        System.out.println("Most expensive: " + max);
    }

    // 5. Products in range 100–500
    public void priceRange() {
        for (Product p : list) {
            if (p.getPrice() >= 100 && p.getPrice() <= 500) {
                System.out.println(p);
            }
        }
    }

    // 6. Cheapest product
    public void cheapest() {
        Product min = list.get(0);
        for (Product p : list) {
            if (p.getPrice() < min.getPrice()) {
                min = p;
            }
        }
        System.out.println("Cheapest: " + min);
    }

    // 7. Products with qty = 0
    public void zeroQty() {
        for (Product p : list) {
            if (p.getQty() == 0) {
                System.out.println(p);
            }
        }
    }

    // 8. Names of electronics
    public void electronicsNames() {
        for (Product p : list) {
            if (p.getCategory().equals("electronics")) {
                System.out.println(p.getName());
            }
        }
    }

    // 9. Electronics products
    public void electronicsProducts() {
        for (Product p : list) {
            if (p.getCategory().equals("electronics")) {
                System.out.println(p);
            }
        }
    }
}