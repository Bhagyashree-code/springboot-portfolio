package com.bhagyashree.service;

import com.bhagyashree.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Service
public class PortfolioService {

    public PortfolioData loadPortfolioData() {
        PortfolioData data = new PortfolioData();

        data.setName("BHAGYASHREE N");
        data.setEmail("bhagyashree3598@gmail.com");

        data.setLinks(Arrays.asList(
                "https://github.com/Bhagyashree-code",
                "https://bhagyashree-portfolio.com/",
                "https://lnkd.in/gZNNdQhM"
            ));
            

        // Education
        List<Education> educationList = new ArrayList<>();
        educationList.add(new Education(
                "Bangalore City University",
                "Full-time Master of Computer Applications (MCA)",
                "CGPA: 8.2",
                "2020-2022",
                "Bangalore"
        ));

        data.setEducationList(educationList);

        // Experience
        List<Experience> experienceList = new ArrayList<>();
        experienceList.add(new Experience(
                "Netcraftz Pulsating Technology",
                "Web Development Intern",
                "Developed an educational website using HTML, CSS, JavaScript, and Bootstrap.",
                "Aug 2022 - Feb 2023",
                "Bangalore"
        ));
        experienceList.add(new Experience(
                "Netcraftz",
                "Java Full Stack Developer Training",
                "Developed and deployed web applications using Java, Spring Boot, React, and MySQL.",
                "2022",
                "Bangalore"
        ));
        data.setExperienceList(experienceList);

        // Skills
        List<SkillCategory> skills = new ArrayList<>();
        skills.add(new SkillCategory("Programming Languages",
                Arrays.asList("Java", "C", "C++", "Visual Basic")));
        skills.add(new SkillCategory("Libraries/Frameworks",
                Arrays.asList("Spring Boot", "Servlets", "JSP", "React", "Bootstrap")));
        skills.add(new SkillCategory("Tools/Platforms",
                Arrays.asList("Git", "Docker", "Postman", "Maven")));
        skills.add(new SkillCategory("Databases",
                Arrays.asList("MySQL", "Oracle", "SQL Server", "MS Access")));
        data.setSkills(skills);

        // Projects
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(
                "Online Exam Portal",
                "Developed an online examination platform enabling students to take exams in a secure and efficient environment."
        ));
        projects.add(new Project(
                "Gender and Age Detection",
                "Implemented an AI-driven image processing system to detect gender and age using deep learning."
        ));
        projects.add(new Project(
                "Task Management System",
                "Built a full-stack web application for task creation, assignment, and tracking."
        ));
        data.setProjects(projects);

        // Certifications
        data.setCertifications(Arrays.asList(
                "Full Stack Developer (Java) - Netcraftz Certification"
        ));

        return data;
    }
}
