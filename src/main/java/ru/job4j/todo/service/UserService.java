package ru.job4j.todo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.todo.model.User;
import ru.job4j.todo.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository users;

    public Optional<User> create(User user) {
        return this.users.create(user);
    }

    public List<User> findAll() {
        return this.users.findAll();
    }

    public User findById(int id) {
        return this.users.findById(id);
    }

    public User findUserByEmailAndPwd(String email, String password) {
        return this.users.findUserByEmailAndPwd(email, password);
    }
}
