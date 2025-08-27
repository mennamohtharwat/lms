package Models.Users;

import Models.Courses.Course;

import java.util.ArrayList;

public class Instructor extends User {
    private String bio;
    private String courses;
    private ArrayList<Course> course = new ArrayList<>();

    public Instructor(String email, String pass, String name, String bio, String courses) {
        super(email, pass, name);
        this.bio = bio;
        this.courses = courses;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBio() {
        return bio;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", bio: "+bio+
                ", courses: "+courses;

    }
}
