package com.flyfish.openspecclaude.controller;

import com.flyfish.openspecclaude.application.UserService;
import com.flyfish.openspecclaude.domain.exception.UserNotFoundException;
import com.flyfish.openspecclaude.dto.ApiResponse;
import com.flyfish.openspecclaude.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<ApiResponse<UserDTO>> getUserById(@PathVariable Long userId) {
        if (userId <= 0) {
            return ResponseEntity.badRequest()
                    .body(ApiResponse.error("INVALID_PARAM", "userId must be greater than 0"));
        }
        try {
            UserDTO user = userService.getUserById(userId);
            return ResponseEntity.ok(ApiResponse.success(user));
        } catch (UserNotFoundException e) {
            return ResponseEntity.status(404)
                    .body(ApiResponse.error("USER_NOT_FOUND", "User not found"));
        }
    }
}
