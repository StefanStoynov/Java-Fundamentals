package Entities;

import Contracts.SuperPower;

public class Power implements SuperPower {
    private String name;
    private double powerPoints;

    public Power(String name, double powerPoints) {
        this.setName(name);
        this.setPowerPoints(powerPoints);
    }

    public void setName(String name) {
        String patern = "@\\w{3,}@+";
        if (patern.matches(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Super power name not in the correct format!");
        }
    }

    public void setPowerPoints(double powerPoints) {
        if (powerPoints >= 0) {
            this.powerPoints = powerPoints;
        } else {
            throw new IllegalArgumentException("Power points should be a possitive number!");
        }
    }

    public String getName() {
        return this.name;
    }

    public double getPowerPoints() {
        return this.powerPoints + this.name.length() / 2;
    }
}
