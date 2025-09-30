package dev.siqueira.user.controller;

import dev.siqueira.user.domain.UserModel;
import dev.siqueira.user.dto.UserDto;
import dev.siqueira.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserModel> save(@RequestBody UserDto userDto) {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDto, userModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
    }
}
