package com.ani.app;

import com.ani.app.model.Product;
import com.ani.app.service.ProductService;

public class ProductMain {

    public static void main(String[] args) {

        ProductService ps = new ProductService();

        ps.add(new Product(1, "Laptop", "electronics", 50000, 10));
        ps.add(new Product(2, "Pen", "stationary", 10, 100));
        ps.add(new Product(3, "Mouse", "electronics", 500, 20));
        ps.add(new Product(4, "Book", "stationary", 200, 50));
        ps.add(new Product(5, "Keyboard", "electronics", 1500, 0));

        ps.totalProducts();
        ps.totalUnits();
        ps.totalValue();
        ps.mostExpensive();
        ps.priceRange();
        ps.cheapest();
        ps.zeroQty();
        ps.electronicsNames();
        ps.electronicsProducts();
    }
}