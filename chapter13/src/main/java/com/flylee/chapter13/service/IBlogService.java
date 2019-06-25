package com.flylee.chapter13.service;

import com.flylee.chapter13.entity.Blog;

import java.util.List;

/**
 * 功能描述：博客服务层
 * 创建时间：2019/6/25 11:27
 *
 * @author flylee
 */
public interface IBlogService {
    List<Blog> getBlogs();

    void deleteBlog(Long id);
}
