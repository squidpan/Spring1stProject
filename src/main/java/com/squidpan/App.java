package com.squidpan;

import com.squidpan.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1=(Alien) context.getBean("alien1");
        System.out.println(obj1.getAge());
        obj1.code();
        //Desktop is lazy-init in spring.xml so dont need this here
        //Desktop obj = (Desktop) context.getBean("com2");
        /*
        //creates all objs in xml - default
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //each getBeans will get the same single Alien object since default scope is singleton
        //if scope is prototype, obj will be created on demand via getBean and muitiple times
        //Alien obj1 = (Alien) context.getBean("alien1");
        Alien obj1 = context.getBean("alien1", Alien.class);
//    	obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();
*/
        //Desktop obj = context.getBean(Desktop.class);

        //obj1.code();
//
//    	Alien obj2 = (Alien) context.getBean("alien1");
//    	System.out.println(obj2.age);
//    	//obj2.code();
    }
}
