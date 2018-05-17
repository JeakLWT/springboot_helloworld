package com.spay;

import com.spay.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHelloworldApplicationTests {

    @Autowired
    private Person person;
    @Autowired
    private DataSource druidDataSource;

    @Autowired
    private RedisTemplate redisTemplate;
	@Test
	public void contextLoads() throws SQLException {
        ApplicationContext applicationContext=new GenericApplicationContext();
        System.out.println(redisTemplate.getConnectionFactory().getConnection().ping());

        redisTemplate.opsForValue().set("test","lwt");
        redisTemplate.opsForValue().get("test");
        System.out.println("------------------------>>"+druidDataSource.getConnection());


        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String bean:
             beanDefinitionNames) {
            System.out.println("=================>>"+bean);

        }

    }

}
