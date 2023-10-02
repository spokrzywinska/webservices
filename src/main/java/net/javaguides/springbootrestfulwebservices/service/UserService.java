package net.javaguides.springbootrestfulwebservices.service;

import net.javaguides.springbootrestfulwebservices.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAll();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);

}
