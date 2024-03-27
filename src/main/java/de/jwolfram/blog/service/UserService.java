package de.jwolfram.blog.service;

import de.jwolfram.blog.entities.user.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(int id);

    User save(User user);

    void deleteById();
}
