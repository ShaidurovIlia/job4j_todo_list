package ru.job4j.todo.service;

import lombok.AllArgsConstructor;
import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Service;
import ru.job4j.todo.model.User;
import ru.job4j.todo.repository.UserRepository;

import java.util.Optional;

@Service
@ThreadSafe
@AllArgsConstructor
public class UserService {
    private final UserRepository users;

    public Optional<User> create(User user) {
        return this.users.create(user);
    }

    public User findById(int id) {
        return this.users.findById(id);
    }

    public User findUserByEmailAndPassword(String email, String password) {
        return this.users.findUserByEmailAndPassword(email, password);
    }
}
