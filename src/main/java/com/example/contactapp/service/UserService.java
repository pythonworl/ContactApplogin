package com.example.contactapp.service;

import com.example.contactapp.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {  // user management and authentication
    UserDto createUser(UserDto userDto);

    UserDto getUser(String email);

    UserDto getUserByUserId(String id);

    UserDto updateUser(String id, UserDto userDto);

    void deletUser(String id);
}
