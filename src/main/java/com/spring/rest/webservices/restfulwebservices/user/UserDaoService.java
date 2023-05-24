package com.spring.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 0;
    static {
        users.add(new User(++usersCount, "adam", LocalDate.now().minusYears(20)));
        users.add(new User(++usersCount, "roshan", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    public User savUser(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User findUser(int id) {
        Predicate<? super User> Predicate = user -> user.getId().equals(id);
        return users.stream().filter(Predicate).findFirst().orElse(null);
    }

    public void deleteUser(int id) {
        Predicate<? super User> Predicate = user -> user.getId().equals(id);
        users.removeIf(Predicate);
    }
}
