package com.spay.lambda;

import com.spay.bean.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyLambda {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User user=new User(18,"zhagnsan");
        User user1=new User(18,"lisi");
        User user2=new User(20,"lisi");
        User user3=new User(21,"zhaoliu");
        User user4=new User(22,"qiliu");
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        List<User> collect = list.stream()
                .filter(x -> x.getAge() ==18)
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
