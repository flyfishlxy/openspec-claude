package com.flyfish.openspecclaude.application;

import com.flyfish.openspecclaude.domain.entity.User;
import com.flyfish.openspecclaude.domain.service.UserDomainService;
import com.flyfish.openspecclaude.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDomainService userDomainService;

    public UserServiceImpl(UserDomainService userDomainService) {
        this.userDomainService = userDomainService;
    }

    @Override
    public UserDTO getUserById(Long userId) {
        User user = userDomainService.getUserById(userId);
        return new UserDTO(user.getUserId(), user.getName(), user.getAge());
    }
}
