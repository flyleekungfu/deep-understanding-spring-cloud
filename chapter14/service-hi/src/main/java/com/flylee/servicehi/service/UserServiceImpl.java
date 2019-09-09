package com.flylee.servicehi.service;

import com.flylee.servicehi.domain.User;
import com.flylee.servicehi.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 *
 * @author flylee
 * @date 2019/9/9 17:22
 */
@Service
public class UserServiceImpl {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserDao userDao;

    public User create(String username, String password){
        User user = new User();
        user.setUsername(username);
        String hash = encoder.encode(password);
        user.setPassword(hash);
        return userDao.save(user);
    }
}
