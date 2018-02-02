package org.joinfaces.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Lars Grefer
 */
@SpringBootApplication
public class WarExampleApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WarExampleApplication.class, args);
    }
}
