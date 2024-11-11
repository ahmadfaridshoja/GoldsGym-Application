package com.example.GoldGym.services.impl;

import com.example.GoldGym.dto.UserDto;
import com.example.GoldGym.mapper.UserMapper;
import com.example.GoldGym.models.User;
import com.example.GoldGym.repositories.UserRepository;
import com.example.GoldGym.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto createUserDto(UserDto userDto) {
        User user = userMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return userMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(int id) {
        User user = userRepository.findById((int) id)
                .orElseThrow(() -> new RuntimeException("Error finding the user"));
        return userMapper.mapToUserDto(user);
    }
    @Override
    public UserDto updateUserById(int id, UserDto userDto) {
        User user = userRepository.findById((int) id)
                .orElseThrow(() -> new RuntimeException("Error finding the user"));
        user.setFirstName(userDto.getFirstName());
        User updatedUser = userRepository.save(user);
        return userMapper.mapToUserDto(updatedUser);
    }

}
