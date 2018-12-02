package com.master.pace.dao.impl;

import com.master.pace.dao.ArticleDao;
import com.master.pace.dao.support.AbstractDao;
import com.master.pace.model.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleDaoImpl extends AbstractDao<Article> implements ArticleDao {

    @Override
    public void deleteById(long id) {
        super.deleteById(Article.class, id);
    }

    @Override
    public List<Article> load() {
        return super.loadByClass(Article.class);
    }

}
