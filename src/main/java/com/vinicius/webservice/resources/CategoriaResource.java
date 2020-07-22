package com.vinicius.webservice.resources;

import com.vinicius.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<User> test() {
        return ResponseEntity.ok().body(new User("vinicius", "cagou"));
    }
}
