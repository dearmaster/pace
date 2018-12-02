package com.master.pace.dao.impl;

import com.master.pace.dao.ArticleDao;
import com.master.pace.model.Article;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest//(classes = Application.class)
//@Import(DatabaseConfiguration.class)
@Rollback
@Transactional
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArticleDaoImplTest {

    @Autowired
    private ArticleDao articleDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    //@Ignore
    @Test
    public void test1Save() {
        Article article = new Article("Article Inserted by Junit Testcase", "Test Content");
        System.out.println(articleDao.save(article));
    }

    @Test
    public void test2Load() {
        List<Article> list = articleDao.load();
        for(Article article : list) {
            System.out.println(article);
        }
    }

}