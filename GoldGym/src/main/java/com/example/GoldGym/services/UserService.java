package com.example.GoldGym.services;
import com.example.GoldGym.dto.UserDto;


public interface UserService {
    UserDto createUserDto(UserDto userDto);
    UserDto getUserById(int id);
    UserDto updateUserById(int id, UserDto userDto);

}
