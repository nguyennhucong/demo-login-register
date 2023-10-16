package com.example.secutiry.demo0.servicre;

import com.example.secutiry.demo0.dto.UserDto;
import com.example.secutiry.demo0.model.User;

public interface UserService {
    User save(UserDto userDto);
}
