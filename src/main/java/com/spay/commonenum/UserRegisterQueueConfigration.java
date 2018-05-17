package com.spay.commonenum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserRegisterQueueConfigration {

        private Logger logger = LoggerFactory.getLogger(UserRegisterQueueConfigration.class);
        /**
         * 配置用户注册主题交换
         * @return
         */
        @Bean
        public TopicExchange userTopicExchange()
        {
            TopicExchange topicExchange = new TopicExchange("register");
            logger.info("用户注册交换实例化成功。");
            return topicExchange;
        }

        /**
         * 配置用户注册
         * 发送激活邮件消息队列
         * 并设置持久化队列
         * @return
         */
        @Bean
        public Queue sendRegisterMailQueue()
        {
            Queue queue = new Queue("register----queue");
            logger.info("创建用户注册消息队列成功");
            return queue;
        }

        /**
         * 配置用户注册
         * 创建账户消息队列
         * 并设置持久化队列
         * @return
         */
        @Bean
        public Queue createAccountQueue()
        {
            Queue queue = new Queue("register--userName");
            logger.info("创建用户注册账号队列成功.");
            return queue;
        }

        /**
         * 绑定用户发送注册激活邮件队列到用户注册主题交换配置
         * @return
         */
        @Bean
        public Binding sendMailBinding(TopicExchange userTopicExchange, Queue sendRegisterMailQueue)
        {
            Binding binding = BindingBuilder.bind(sendRegisterMailQueue).to(userTopicExchange).with("mail--routing");
            logger.info("绑定发送邮件到注册交换成功");
            return binding;
        }

        /**
         * 绑定用户创建账户到用户注册主题交换配置
         * @return
         */
        @Bean
        public Binding createAccountBinding(TopicExchange userTopicExchange,Queue createAccountQueue)
        {
            Binding binding = BindingBuilder.bind(createAccountQueue).to(userTopicExchange).with("username--register");
            logger.info("绑定创建账号到注册交换成功。");
            return binding;
        }


}
