package com.flylee.chapter13.web;

import com.flylee.chapter13.entity.Blog;
import com.flylee.chapter13.service.impl.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 功能描述：博客控制层
 * 创建时间：2019/6/25 11:33
 *
 * @author flylee
 */
@RestController
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping
    public ModelAndView list(Model model){
        List<Blog> blogs = blogService.getBlogs();
        model.addAttribute("blogsList", blogs);
        return new ModelAndView("blogs/list", "blogModel", model);
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/{id}/deletion")
    public ModelAndView delete(@PathVariable("id") Long id, Model model){
        blogService.deleteBlog(id);
        model.addAttribute("blogsList", blogService.getBlogs());
        return new ModelAndView("/blogs/list", "blogModel", model);
    }
}
