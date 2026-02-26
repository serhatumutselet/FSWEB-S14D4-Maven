package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[]{
                new Chocolate("Chocolate", 15, "Dark chocolate", 70),
                new Coke("Coke", 8, "Classic coke", false),
                new Bread("Bread", 12, "Whole wheat bread", true)
        };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products == null) {
            return;
        }
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}