package com.example.exercisepracticethymleaf.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private boolean inStock;

    public Product() {
    }


    public Product(int id, String name, Double price, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }
}
