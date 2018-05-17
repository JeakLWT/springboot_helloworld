package com.spay.listenner;

import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Component
public class MyListenner implements ServletContextListener {



    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        System.out.println("==========MyListenner      contextInitialized =============");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {


        System.out.println("==========MyListenner     contextInitialized     =============");

    }
}
