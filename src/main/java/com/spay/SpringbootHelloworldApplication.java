package com.spay;

import com.spay.bean.MyBean;
import com.spay.config.MyInterceptorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworldApplication.class, args);


        String[] beanDefinitionNames = SpringContextHolder.getApplicationContext().getBeanDefinitionNames();


        System.out.println("===============>>"+SpringContextHolder.getApplicationContext().containsBean("myInterceptorConfig")+"<<===========");
        for (String bean:
                beanDefinitionNames) {
            System.out.println("=================>>"+bean);

        }

    }
}
