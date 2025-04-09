package com.bhagyashree.model;

public class Experience {
    private String company;
    private String position;
    private String description;
    private String duration;
    private String location;

    // Default constructor
    public Experience() {}

    // Parameterized constructor
    public Experience(String company, String position, String description, String duration, String location) {
        this.company = company;
        this.position = position;
        this.description = description;
        this.duration = duration;
        this.location = location;
    }

    // Getters and Setters
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
