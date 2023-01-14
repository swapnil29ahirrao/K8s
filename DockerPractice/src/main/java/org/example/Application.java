package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RequestMapping
@RestController
public class Application
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class,args);
    }

    @GetMapping
    public String hello(){
        return "Hello";
    }
}
