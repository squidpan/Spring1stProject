package com.squidpan.config;

import com.squidpan.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean(name = {"Beast","desktop","com1"})
    @Bean
    public Desktop desktop() {
        return new Desktop();
    }
}

