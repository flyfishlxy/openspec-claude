package com.flyfish.openspecclaude.domain.service;

import com.flyfish.openspecclaude.domain.entity.User;
import com.flyfish.openspecclaude.domain.exception.UserNotFoundException;

public interface UserDomainService {
    User getUserById(Long userId) throws UserNotFoundException;
}
