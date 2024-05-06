package com.example.usermanagement.service;

import com.example.usermanagement.entity.User;
import com.example.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(long id)  {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(User user, User userInDb) {
        userInDb.setEmail(user.getEmail());
        userInDb.setLastName(user.getLastName());
        userInDb.setFirstName(user.getFirstName());
        userInDb.setDateOfBirth(user.getDateOfBirth());
        userInDb.setPhoneNumber(user.getPhoneNumber());
        userInDb.setActive(user.isActive());
        userInDb.setRegistrationDate(user.getRegistrationDate());
        return userRepository.save(userInDb);
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
