package ru.job4j.todo.repository;

import lombok.AllArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.job4j.todo.model.User;
import ru.job4j.todo.util.SessionWrapper;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class UserRepository {

    private static final String SELECT_BY_ID_QUERY = "from User i where i.id = :Id";
    private static final String SELECT_BY_EMAIL_AND_PASSWORD_QUERY =
            "from User i where i.email = :Email and i.password = :Password";
    private SessionFactory factory;

    public Optional<User> create(User user) {
        try {
            User finalUser = (User) SessionWrapper.wrap(session ->
                    session.save(user), factory);
            return Optional.of(finalUser);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    public User findById(int id) {
        return (User) SessionWrapper.wrap(
                session ->
                        session.createQuery(SELECT_BY_ID_QUERY)
                                .setParameter("Id", id)
                                .getSingleResult(), factory);
    }

    public User findUserByEmailAndPassword(String email, String password) {
        return (User) SessionWrapper.wrap(
                session ->
                        session.createQuery(SELECT_BY_EMAIL_AND_PASSWORD_QUERY)
                                .setParameter("Email", email)
                                .setParameter("Password", password)
                                .getSingleResult(), factory);
    }
}