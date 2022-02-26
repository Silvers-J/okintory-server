package com.okizone.okintory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class OkintoryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OkintoryServerApplication.class, args);
	}

    @Controller
    class HelloWorld {
        @GetMapping("/")
        @ResponseBody
        String helloWorld() {
            return "Hello world";
        }
    }


}
