package com.bhagyashree.controller;

import com.bhagyashree.model.PortfolioData;
import com.bhagyashree.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {
    @Autowired
    private PortfolioService portfolioService;
    
    @GetMapping("/")
    public String showPortfolio(Model model) {
        PortfolioData portfolio = portfolioService.loadPortfolioData();
        model.addAttribute("portfolio", portfolio);
        return "portfolio";
    }
}