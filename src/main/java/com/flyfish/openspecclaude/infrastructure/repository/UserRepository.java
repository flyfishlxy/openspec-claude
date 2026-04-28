package com.flyfish.openspecclaude.infrastructure.repository;

import com.flyfish.openspecclaude.domain.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository {
    private static final Map<Long, User> STORE = Map.of(
            1L, new User(1L, "张三", 25),
            2L, new User(2L, "李四", 30),
            3L, new User(3L, "王五", 28)
    );

    public Optional<User> findById(Long userId) {
        return Optional.ofNullable(STORE.get(userId));
    }
}
