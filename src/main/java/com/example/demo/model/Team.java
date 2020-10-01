package com.example.demo.model;


public class Team {

    private int id;
    private String name;
    private String city;
    private String primaryColor;

    public Team(int id, String name, String city, String primaryColor) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.primaryColor = primaryColor;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
