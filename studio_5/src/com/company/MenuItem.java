package com.company;

public class MenuItem {




    private String name;
    private String category;   //appetizer, mian dish, or dessert
    private String description;
    private double price;
    private boolean isNew;

    public MenuItem(String name, String category, String description, double price, boolean isNew){
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.isNew = isNew;
    }

    public MenuItem(String name, String category, String description, double price){
     this( name, category, description, price, true);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
