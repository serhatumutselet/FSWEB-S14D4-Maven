package org.example.model;

public class Bread extends ProductForSale {
    private final boolean wholeWheat;

    public Bread(String type, int price, String description) {
        this(type, price, description, true);
    }

    public Bread(String type, int price, String description, boolean wholeWheat) {
        super(type, price, description);
        this.wholeWheat = wholeWheat;
    }

    public boolean isWholeWheat() {
        return wholeWheat;
    }

    @Override
    public void showDetails() {
        System.out.println(
                "Bread - type: " + getType()
                        + ", price: " + getPrice()
                        + ", description: " + getDescription()
                        + ", wholeWheat: " + wholeWheat
        );
    }
}

