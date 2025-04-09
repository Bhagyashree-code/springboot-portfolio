package com.bhagyashree.model;

import java.util.List;

public class SkillCategory {
    private String categoryName;
    private List<String> skills;

    // ✅ Add this constructor
    public SkillCategory(String categoryName, List<String> skills) {
        this.categoryName = categoryName;
        this.skills = skills;
    }

    // ✅ No-args constructor (also required by Spring / Jackson)
    public SkillCategory() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
