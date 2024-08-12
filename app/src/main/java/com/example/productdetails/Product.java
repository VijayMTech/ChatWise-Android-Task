package com.example.productdetails;

import java.util.List;

public class Product {

    private int id;
    private String title;
    private String description;
    private String category;
    private float price;
    private float discountPercentage;
    private float rating;
    private List<String> images;
    private String thumbnail;

    private int  stock;
    private String brand;

    // Constructor
    public Product(int id, String title, String description, String category, float price,
                   float discountPercentage, float rating, List<String> images, String thumbnail,int stock,String brand ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.images = images;
        this.thumbnail = thumbnail;
        this.stock = stock;
        this.brand = brand;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String band){
        this.brand = brand;
    }
}
