package org.example.rpg;

public abstract class Monster {
    private final String name;
    private final int hitPoints;
    private final double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public double attack() {
        double total = getDamage();
        if (this instanceof Bleedable) {
            total += ((Bleedable) this).bleed();
        }
        if (this instanceof Poisonable) {
            total += ((Poisonable) this).poison();
        }
        return total;
    }
}

