package com.school.service.impl;

import com.school.pojo.Article;
import com.school.pojo.PageBean;
import org.springframework.stereotype.Service;

@Service
public interface ArticleService {

    //新增文章
     void add(Article article);

     //条件分页列表查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
