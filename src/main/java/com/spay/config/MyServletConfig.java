package com.spay.config;

import com.spay.servlet.MyServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;
import java.security.PublicKey;

@Configuration
public class MyServletConfig {

    @Autowired
    private MyServlet myServlet;

    @Bean
    public ServletRegistrationBean servletRegistration(){
        ServletRegistrationBean servletRegistration = new ServletRegistrationBean(myServlet);
        return servletRegistration;

    }
}
