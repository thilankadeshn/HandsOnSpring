package com.studytrails.tutorials.springremotingrmiclient;

/**
 * Created by thilanka on 12/15/15.
 */
import com.studytrails.tutorials.springremotingrmiserver.CalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringRemotingRmi {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-client.xml");
        CalService calService = (CalService)context.getBean("CalService");
        Integer sum = calService.getSum(12,13);
        System.out.println("The Sum is : " + sum);
    }
}

