package com.boker.springbootvalidation.controller;

import com.boker.springbootvalidation.dto.UserRequest;
import com.boker.springbootvalidation.model.User;
import com.boker.springbootvalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("users/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> createUser(@RequestBody @Valid UserRequest userRequest) {
        return ResponseEntity.ok(userService.createUser(userRequest));
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>> fetchUser() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/getByUserId")
    public ResponseEntity<User> getUserByUserId(@RequestParam long userId) {
        return ResponseEntity.ok(userService.findByUserId(userId));
    }
}
