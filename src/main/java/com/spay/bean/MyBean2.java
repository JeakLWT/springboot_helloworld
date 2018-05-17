package com.spay.bean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyBean2 implements CommandLineRunner,Ordered {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("***************Mybean2");
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
