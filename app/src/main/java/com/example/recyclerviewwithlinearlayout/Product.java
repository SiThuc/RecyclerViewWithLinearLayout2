package com.example.recyclerviewwithlinearlayout;

public class Product {
    private int imgSource;
    private String name;

    public Product(int imgSource, String name) {
        this.imgSource = imgSource;
        this.name = name;
    }

    public int getImgSource() {
        return imgSource;
    }

    public void setImgSource(int imgSource) {
        this.imgSource = imgSource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
