package com.studytrails.tutorials.springremotingrmiserver;

/**
 * Created by thilanka on 12/15/15.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartRmiServer {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-server.xml");
        System.out.println("Waiting for Request from Client ...");

    }
}
