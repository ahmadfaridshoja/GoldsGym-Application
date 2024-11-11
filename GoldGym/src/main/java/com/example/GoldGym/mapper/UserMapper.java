package com.example.GoldGym.mapper;


import com.example.GoldGym.models.User;
import com.example.GoldGym.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User mapToUser(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getAddress()
        );
    }
    public UserDto mapToUserDto (User user){
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getAddress()
        );
    }
}