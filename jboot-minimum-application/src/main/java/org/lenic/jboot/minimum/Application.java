package org.lenic.jboot.minimum;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@Controller
public class Application {
    @Value("${spring.config.name}")
    private String name;
    @RequestMapping("/")
    @ResponseBody
    public String greetings() {
        return "hi,spring boot "+name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}