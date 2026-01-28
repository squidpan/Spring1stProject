package com.squidpan.config;

import com.squidpan.Alien;
import com.squidpan.Computer;
import com.squidpan.Desktop;
import com.squidpan.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.squidpan")
public class AppConfig {
//    @Bean
//    //@Autowired not needed but makes it clear
//    //Autowire Alien and Computer
//    //@Qualifier with name of bean to use
//    //public Alien alien(@Autowired @Qualifier("desktop") Computer com) {
//    public Alien alien(@Autowired Computer com) { //@Qualifier("desktop") instead use @Primary for Laptop just like in xml config
//
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }
}

