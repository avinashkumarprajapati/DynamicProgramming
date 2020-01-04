package com.avinash.knapsack;


public class Product {
    private String name;
    private double qunatity;
    private double priceValue;
    private double weight;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", qunatity=" + qunatity +
                ", priceValue=" + priceValue +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getQunatity() {
        return qunatity;
    }

    public double getPriceValue() {
        return priceValue;
    }

    public double getWeight() {
        return weight;
    }

    public Product(String name, double qunatity, double priceValue, double weight) {
        this.name = name;
        this.qunatity = qunatity;
        this.priceValue = priceValue;
        this.weight = weight;
    }
}
