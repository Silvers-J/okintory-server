package com.okizone.okintory.user.service;

import com.okizone.okintory.user.model.User;
import com.okizone.okintory.user.repository.UserRepository;
import com.okizone.okintory.user.enums.RolesEnum;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser() {
        User user = new User();
        user.setUsername("firstUser");
        user.setEmail("first@user.com");
        user.setPassword("ez");
        user.setRole(RolesEnum.CUSTOMER);

        userRepository.save(user);
    }

}
