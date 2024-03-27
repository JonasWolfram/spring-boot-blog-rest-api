package de.jwolfram.blog.service.impl;

import de.jwolfram.blog.entities.user.User;
import de.jwolfram.blog.repository.UserRepository;
import de.jwolfram.blog.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void deleteById() {

    }
}
