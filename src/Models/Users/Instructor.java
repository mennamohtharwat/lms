package Models.Users;

import Models.Courses.Course;
import java.util.ArrayList;

public class Instructor extends User {
    private String bio;
    private ArrayList<Course> courses = new ArrayList<>();

    public Instructor(String email, String pass, String name, String bio, String courses) {
        super(email, pass, name);
        this.bio = bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBio() {
        return bio;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", bio: "+bio;
    }
}