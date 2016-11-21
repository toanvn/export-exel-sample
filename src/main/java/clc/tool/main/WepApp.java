package clc.tool.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by qup on 11/21/16.
 */
@EnableAutoConfiguration
@SpringBootApplication
public class WepApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WepApp.class, args);
    }
}
