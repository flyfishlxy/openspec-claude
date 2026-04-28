package com.flyfish.openspecclaude.application;

import com.flyfish.openspecclaude.dto.UserDTO;

public interface UserService {
    UserDTO getUserById(Long userId);
}
