package org.example.model;

public class Coke extends ProductForSale {
    private final boolean sugarFree;

    public Coke(String type, int price, String description) {
        this(type, price, description, false);
    }

    public Coke(String type, int price, String description, boolean sugarFree) {
        super(type, price, description);
        this.sugarFree = sugarFree;
    }

    public boolean isSugarFree() {
        return sugarFree;
    }

    @Override
    public void showDetails() {
        System.out.println(
                "Coke - type: " + getType()
                        + ", price: " + getPrice()
                        + ", description: " + getDescription()
                        + ", sugarFree: " + sugarFree
        );
    }
}

