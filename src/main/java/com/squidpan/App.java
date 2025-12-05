package com.squidpan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //creates all objs in xml - default
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //each getBeans will get the same single Alien object since default scope is singleton
        //if scope is prototype, obj will be created on demand via getBean and muitiple times
        Alien obj1 = (Alien) context.getBean("alien1");
        Alien obj2 = (Alien) context.getBean("alien1");
        //obj1.code();
        //obj2.code();

    }
}
