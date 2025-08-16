public class User {
    private int id;
    private String email;
    private String pass;
    private String name;

    public User() {
        this.id = 0;
        this.email = "Unknown";
        this.pass = "Unknown";
        this.name = "Unknown";
    }

    public User(int id, String email, String pass, String name) {
        this.id = id;
        this.email = email;
        this.pass = pass;
        this.name = name;
    }

    public void setId(final int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID");
        }
    }

    public int getId() {
        return this.id;
    }

    public void setEmail(final String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email");
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setPass(final String pass) {
        if (pass != null && pass.length() >= 4) {
            this.pass = pass;
        } else {
            System.out.println("Password must be at least 4 characters.");
        }
    }

    public String getPass() {
        return this.pass;
    }

    public void setName(final String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }

    public String getName() {
        return this.name;
    }

    public void display() {
        System.out.println("id" + id);
        System.out.println("email" + email);
        System.out.println("name" + name);
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name +
                ", email: " + email;
    }
}