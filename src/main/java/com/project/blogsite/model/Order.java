package com.project.blogsite.model;

public class Order {
    public int id;
    public String name;
    public String drink;

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public Order(int id, String name, String drink) {
        this.id = id;
        this.name = name;
        this.drink = drink;
    }
}
