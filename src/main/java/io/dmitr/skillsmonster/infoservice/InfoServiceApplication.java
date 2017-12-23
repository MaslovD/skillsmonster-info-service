package io.dmitr.skillsmonster.infoservice;

import io.dmitr.skillsmonster.infoservice.queue.RedisMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InfoServiceApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(InfoServiceApplication.class);



    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(InfoServiceApplication.class, args);

    }
}
