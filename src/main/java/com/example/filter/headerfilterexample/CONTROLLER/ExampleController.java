package com.example.filter.headerfilterexample.CONTROLLER;

import com.example.filter.headerfilterexample.service.ExampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/v1/headers")
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    /**
     *
     * @return
     */
    @GetMapping
    public ResponseEntity<String>getHello(){
        this.exampleService.ejemplo1();
        return ResponseEntity.ok("Hello");
    }
    @GetMapping(path = "/test")
    public ResponseEntity<String>getHello2(){
        this.exampleService.ejemplo2();
        return ResponseEntity.ok("Hello 2");
    }
    @GetMapping(path = "/test2")
    public ResponseEntity<String>getHello3(){
        this.exampleService.ejemplo3();
        return ResponseEntity.ok("Hello 3");
    }
    @GetMapping(path = "/test3")
    public ResponseEntity<String>getHello4(){
        this.exampleService.ejemplo4();
        return ResponseEntity.ok("Hello 4");
    }
}
