package com.flylee.adminserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 功能描述：安全配置
 * 创建时间：2019/6/17 17:32
 *
 * @author lifei
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/login.html").loginProcessingUrl("/login").permitAll();
        http.logout().logoutUrl("/logout");
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/login.html","/**/**.css","/img/**","/third-party/**").permitAll();
        http.authorizeRequests().antMatchers("/**").authenticated();
        http.httpBasic();
    }
}
