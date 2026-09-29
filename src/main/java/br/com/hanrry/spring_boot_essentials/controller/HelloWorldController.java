package br.com.hanrry.spring_boot_essentials.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/hello")
@RestController
public class HelloWorldController {

//    @GetMapping
//    public String helloWorld(){
//        return "Hello World!";
//
//    }

//    @GetMapping
//    public ResponseEntity<String> helloWorld(){
//        return ResponseEntity.ok("Hello World");
//
//    }

//    @PostMapping
//    public ResponseEntity<String> helloWorld() {
//        return new ResponseEntity<>("Hello World", HttpStatus.OK);
//    }
}
