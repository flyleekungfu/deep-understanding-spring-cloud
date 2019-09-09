package com.flylee.servicehi.repository;

import com.flylee.servicehi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户dao
 *
 * @author flylee
 * @date 2019/9/9 15:36
 */
public interface UserDao extends JpaRepository<User, Long> {
}
