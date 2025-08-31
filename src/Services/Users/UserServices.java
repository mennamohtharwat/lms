package Services.Users;

import App.Database;
import Models.Users.User;

public class UserServices {
    public boolean signUp(String email, String password, String name) {
        for (User use : Database.users) {
            if (use.getEmail().equals(email)) {
                System.out.println("Email already exists!");
                return false;
            }
        }
        User newUser = new User(email, password, name);
        Database.users.add(newUser);
        System.out.println("User registered successfully: " + newUser);
        return true;
    }

    public boolean login(String email, String password) {
        for (User use : Database.users) {
            if (use.getEmail().equals(email) && use.getPassword().equals(password)) {
                System.out.println("Login successful! Welcome " + use.getName());
                return true;
            }
        }
        System.out.println("Invalid email or password.");
        return false;
    }
}
