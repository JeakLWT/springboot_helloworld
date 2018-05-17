package com.spay.config;

import com.spay.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer{

    @Autowired
    private MyInterceptor myInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("========        registry           ===========");
        registry.addInterceptor(myInterceptor);
    }
/*
    @Bean
    public InterceptorRegistration interceptorRegistration(){
        InterceptorRegistration interceptorRegistration = new InterceptorRegistration(myInterceptor);

        return interceptorRegistration;

    }*/

}
