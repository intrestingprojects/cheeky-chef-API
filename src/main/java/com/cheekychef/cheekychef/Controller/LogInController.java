package com.cheekychef.cheekychef.Controller;

import com.cheekychef.cheekychef.Model.LogIn;
import com.cheekychef.cheekychef.Repository.LogInAndSignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LogInController {

    @Autowired
    private LogInAndSignUp LogInAndSignUp;
    @PostMapping("/")
    public ResponseEntity<?> addUser(@RequestBody LogIn user) {
        LogIn save = this.LogInAndSignUp.save(user);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/")
    public ResponseEntity<?> getUser() {
        return ResponseEntity.ok(this.LogInAndSignUp.findAll());
    }
}
