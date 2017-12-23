package io.dmitr.skillsmonster.infoservice.controller;


import io.dmitr.skillsmonster.infoservice.queue.RedisMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.UUID;

@Controller
public class RestController {
    @Autowired
    private RedisMessagePublisher redisMessagePublisher;

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public void sendMessage() {
        String message = "Message " + UUID.randomUUID();
        redisMessagePublisher.publish(message);
    }
}
