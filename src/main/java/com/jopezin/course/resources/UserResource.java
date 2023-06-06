package com.jopezin.course.resources;


import com.jopezin.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Joao Pedro", "jope@gmail.com","912821829190", "12345");
        return ResponseEntity.ok().body(u);
    }
}
