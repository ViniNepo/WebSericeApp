package com.vinicius.webservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categoria")
public class Teste {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<User> test() {
        return ResponseEntity.ok().body(new User("vinicius", "cagou"));
    }
}
