package com.flyfish.openspecclaude.infrastructure.repository;

import com.flyfish.openspecclaude.domain.entity.User;
import com.flyfish.openspecclaude.domain.exception.UserNotFoundException;
import com.flyfish.openspecclaude.domain.service.UserDomainService;
import org.springframework.stereotype.Service;

@Service
public class UserDomainServiceImpl implements UserDomainService {

    private final UserRepository userRepository;

    public UserDomainServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
    }
}
