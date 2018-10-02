package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private String welcomeMsg;

    public WelcomeController(@Value("${WELCOME_MESSAGE}") String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    @GetMapping("/")
    public String getHello(){
        return welcomeMsg;
    }

    public String sayHello() {
        return "A welcome message";
    }
}
