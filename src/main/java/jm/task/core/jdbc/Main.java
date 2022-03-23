package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Katya", "Kalinina", (byte) 18);
        userService.saveUser("Sofia", "Sokolova", (byte) 24);
        userService.saveUser("Anna", "Egorskaya", (byte) 28);
        userService.saveUser("Artem", "Myakishev", (byte) 15);
        for (User user: (userService.getAllUsers())){
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
