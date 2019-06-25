package com.flylee.chapter13.dao;

import com.flylee.chapter13.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：userDao
 * 创建时间：2019/6/25 16:04
 *
 * @author flylee
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
