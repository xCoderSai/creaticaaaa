package com.example.newthingy;

public class Facility {
    String name;
    String address;
    private String city;
    private String state;

    public Facility(String name, String address, String city, String state) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public String getCityState() {
        return city + ", " + state;
    }
}
