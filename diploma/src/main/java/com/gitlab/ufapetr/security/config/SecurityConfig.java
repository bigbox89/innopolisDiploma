package com.gitlab.ufapetr.security.config;

import com.gitlab.ufapetr.security.details.CustomerDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CustomerDetailsServiceImpl customerDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customerDetailsService).passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/").hasAuthority("")
                .antMatchers("/").authenticated()
                .antMatchers("/index.html").authenticated()
                .antMatchers("/customers_list").authenticated()
                .antMatchers("/products_list").authenticated()
                .antMatchers("/parts_list").authenticated()
                .antMatchers("/customer/**").authenticated()
                .antMatchers("/orders_list").hasAuthority("ADMIN")
                .antMatchers("/order/**").hasAuthority("ADMIN")
                .antMatchers("/product/**").authenticated()
                .antMatchers("/part/**").hasAuthority("ADMIN")
                .antMatchers("/signup").permitAll()
                .and()
                .formLogin()
                .loginPage("/signin")
                .defaultSuccessUrl("/index.html")

                .usernameParameter("nick")
                .passwordParameter("password")
                .permitAll();
    }
}
