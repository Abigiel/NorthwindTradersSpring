package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SimpleProductDao implements ProductDao{
    private List<Product> products;

    public SimpleProductDao(List<Product> products) {
        this.products = products;
        this.products.add(new Product(1, "Laptop", "Electronics", 899));
        this.products.add(new Product(2, "Headphones", "Electronics", 59));
        this.products.add(new Product(5, "Backpack", "Accessories", 49));
        this.products.add(new Product(4, "Coffee Maker", "Home and Kitchen", 129));

    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
