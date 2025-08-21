package Models.Users;

import javax.naming.Name;
import java.util.UUID;

public class User {
    private final String id = UUID.randomUUID().toString();
    private String email;
    private String password;
    private String name;

    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setEmail(final String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email");
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(final String password) {
        if (validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 4 characters.");
        }
    }

    public String getPassword() {
        return this.password;
    }

    public void setName(final String name) {
        if (validateName(name)) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }

    public String getName() {
        return this.name;
    }

    public boolean validateEmail(String email){
      return email != null && email.contains("@");
    }

    public boolean validatePassword(String password) {
        return password != null && password.length() >= 4;
    }
    public boolean validateName(String name){
        return name != null && !name.isEmpty();
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name +
                ", email: " + email;
    }
}