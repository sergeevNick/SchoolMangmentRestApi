package ru.sergeev.school.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sergeev.school.entities.User;
import ru.sergeev.school.repository.UserRepository;
import ru.sergeev.school.services.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> listAllLogIns() {
        return userRepository.findAll();
    }
}
