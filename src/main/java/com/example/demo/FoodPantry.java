package com.example.demo;

public class FoodPantry {
    private String address;
    private int nbCans;
    private int nbBreads;
    private String owner;
    private Float water;

    public FoodPantry(String address, int nbCans, int nbBreads, String owner, Float water) {

        this.address = address;
        this.nbCans = nbCans;
        this.nbBreads = nbBreads;
        this.owner = owner;
        this.water = water;
    }

    @Override
    public String toString() {
        return "FoodPantry{" +
                "address='" + address + '\'' +
                ", nbCans=" + nbCans +
                ", nbBreads=" + nbBreads +
                ", owner='" + owner + '\'' +
                ", water=" + water +
                '}';
    }
}
