package com.flyfish.openspecclaude.dto;

public class UserDTO {
    private Long userId;
    private String name;
    private Integer age;

    public UserDTO(Long userId, String name, Integer age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
