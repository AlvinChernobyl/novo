package br.balduco.panettone.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Testeee {

    @RestController
    public class HelloController {

        @GetMapping("/hello")
        public String sayHello(){
            return "Hello curse";
        }

        @GetMapping("/hellohtml")
        public String sayHtml(){
            return "ifs or practices. It often encompasses stories, myths";
        }
    }
}
git 