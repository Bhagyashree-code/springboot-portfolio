package com.bhagyashree.model;

public class Education {
    private String institution;
    private String degree;
    private String score;
    private String duration;
    private String location;

    // Constructor
    public Education(String institution, String degree, String score, String duration, String location) {
        this.institution = institution;
        this.degree = degree;
        this.score = score;
        this.duration = duration;
        this.location = location;
    }

    // Getters and Setters
    public String getInstitution() { return institution; }
    public void setInstitution(String institution) { this.institution = institution; }
    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }
    public String getScore() { return score; }
    public void setScore(String score) { this.score = score; }
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}