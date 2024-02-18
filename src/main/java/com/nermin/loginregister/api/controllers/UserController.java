package com.nermin.loginregister.api.controllers;

import com.nermin.loginregister.business.abstracts.UserService;
import com.nermin.loginregister.core.utilities.results.DataResult;
import com.nermin.loginregister.core.utilities.results.Result;
import com.nermin.loginregister.entities.User;
import com.nermin.loginregister.dto.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor

public class UserController {
    private UserService userService;
@PostMapping("/register")
    public Result register(@RequestBody User user) {
    return this.userService.register(user);
}
@GetMapping("/login")
    public DataResult<User> login(@RequestParam String userName,@RequestParam String password) {
    return this.userService.login(userName,password);
}


}
