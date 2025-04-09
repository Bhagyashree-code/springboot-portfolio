package com.bhagyashree.model;

public class Project {
    private String title;
    private String description;

    // Default constructor
    public Project() {}

    // Parameterized constructor
    public Project(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getters and Setters
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
}
