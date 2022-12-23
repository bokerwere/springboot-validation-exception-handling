package com.boker.springbootvalidation.service;
import com.boker.springbootvalidation.dto.UserRequest;
import com.boker.springbootvalidation.model.User;
import com.boker.springbootvalidation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(UserRequest userRequest) {
        User user = User.build(0L, userRequest.getUserName(), userRequest.getUserPhoneNo(), userRequest.getUserEmail(), userRequest.getNationality(), userRequest.getAge(), userRequest.getGender());
        return userRepository.save(user);
    }
    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User findByUserId(long userId) {
        return userRepository.findByUserId(userId).orElseThrow(() -> new NoSuchElementException("no user with id:"+userId));
    }
}
