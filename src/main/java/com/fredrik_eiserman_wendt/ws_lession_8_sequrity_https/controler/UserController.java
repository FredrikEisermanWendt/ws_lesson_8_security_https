package com.fredrik_eiserman_wendt.ws_lession_8_sequrity_https.controler;


import com.fredrik_eiserman_wendt.ws_lession_8_sequrity_https.model.User;
import com.fredrik_eiserman_wendt.ws_lession_8_sequrity_https.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    
    private final UserRepository userRepository;
    
    
    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    
    @GetMapping
    public ResponseEntity<List<User>> findAllUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }
    
    @PostMapping
    public ResponseEntity<User> postUser(@RequestBody User user){
        return ResponseEntity.ok(user);
    }
    
}
