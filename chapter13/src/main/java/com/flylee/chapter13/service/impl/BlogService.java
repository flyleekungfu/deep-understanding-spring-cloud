package com.flylee.chapter13.service.impl;

import com.flylee.chapter13.entity.Blog;
import com.flylee.chapter13.service.IBlogService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 功能描述：博客实现类
 * 创建时间：2019/6/25 11:28
 *
 * @author flylee
 */
@Service
public class BlogService implements IBlogService {
    private List<Blog> list = new ArrayList<>();

    public BlogService(){
        list.add(Blog.builder().id(1L).name("first blog").content("first'").build());
        list.add(Blog.builder().id(2L).name("second blog").content("second'").build());
    }

    @Override
    public List<Blog> getBlogs() {
        return list;
    }

    @Override
    public void deleteBlog(Long id) {
        list.removeIf(blog -> Objects.equals(id, blog.getId()));
    }
}
