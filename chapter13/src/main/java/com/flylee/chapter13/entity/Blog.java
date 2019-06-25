package com.flylee.chapter13.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述：博客实体
 * 创建时间：2019/6/25 11:22
 *
 * @author flylee
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private Long id;
    private String name;
    private String content;
}
