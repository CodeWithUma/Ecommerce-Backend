package com.personal.backend.service.user;

import com.personal.backend.dto.UserDto;
import com.personal.backend.model.User;
import com.personal.backend.request.CreateUserRequest;
import com.personal.backend.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long id);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long id);
    UserDto convertUserToDto(User user);
}
