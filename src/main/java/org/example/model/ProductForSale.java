package org.example.model;

public abstract class ProductForSale {
    private final String type;
    private final int price;
    private final String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getSalesPrice(int quantity) {
        return quantity * price;
    }

    public abstract void showDetails();
}

