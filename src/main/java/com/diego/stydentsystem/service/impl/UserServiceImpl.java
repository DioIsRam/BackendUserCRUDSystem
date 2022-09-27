package com.diego.stydentsystem.service.impl;

import com.diego.stydentsystem.utils.exception.UserNotFoundException;
import com.diego.stydentsystem.model.User;
import com.diego.stydentsystem.repository.UserRepository;
import com.diego.stydentsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implementacion interna de {@link UserService}.
 * @author diego ramirez
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long userId){
        return Optional.ofNullable(userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId)));
    }

    @Override
    public String deleteById(Long id) {
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with id "+id+" has been deleted successfully.";
    }
}
