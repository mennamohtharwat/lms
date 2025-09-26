package Services.Users;

import App.Database;
import Models.Users.User;

public class UserServices {
    public boolean signUp(User newUser) {
        for (User use : Database.users) {
            if (use.getEmail().equals(newUser.getEmail())) {
                System.out.println("Email already exists!");
                return false;
            }
        }
        Database.users.add(newUser);
        System.out.println("User registered successfully: " + newUser);
        return true;
    }

    public boolean login(User logIn) {
        for (User use : Database.users) {
            if (use.getEmail().equals(logIn.getEmail()) &&
                    use.getPassword().equals(logIn.getPassword())) {
                System.out.println("Login successful! Welcome " + use.getName());
                return true;
            }
        }
        System.out.println("Invalid email or password.");
        return false;
    }
}