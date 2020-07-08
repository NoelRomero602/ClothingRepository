
package com.example.Clothing.controller;

import com.example.Clothing.entity.Clothing_Article;
import com.example.Clothing.service.Clothing_Article_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Clothing_Article_RestController {
    Clothing_Article_Service clothingArticleService;
    @Autowired
    Clothing_Article_RestController(Clothing_Article_Service clothingArticleService)
    {
        this.clothingArticleService = clothingArticleService;
    }
    @GetMapping("/clothing")
    public List<Clothing_Article> findAll(){return clothingArticleService.findAll();}
}
