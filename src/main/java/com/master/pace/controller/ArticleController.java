package com.master.pace.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("article")
public class ArticleController {

    private static final Logger logger = LogManager.getLogger(ArticleController.class);

    @GetMapping
    public String getArticles(@RequestParam(name="uId", required = true) String userId, Model model) {
        logger.info("ArticleController#getArticles");
        return "SUCCESS";
    }

}