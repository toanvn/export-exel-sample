package clc.tool.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by qup on 11/21/16.
 */
@EnableAutoConfiguration
@SpringBootApplication
public class WepApp {

    static Logger logger = LoggerFactory.getLogger(WepApp.class);

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = SpringApplication.run(WepApp.class, args);
        logger.debug("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            logger.debug(beanName);
        }
    }
}
