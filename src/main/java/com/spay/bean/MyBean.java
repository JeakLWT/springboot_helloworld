package com.spay.bean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MyBean  implements CommandLineRunner ,Ordered {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner==============》》");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
