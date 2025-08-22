package Models.Courses;

import Models.Users.Instructor;
import java.util.ArrayList;
import java.util.UUID;

public class Courses {
    private final String id = UUID.randomUUID().toString();
    private String title;
    private String description;
    private Instructor instructor;
    private ArrayList<Lessons> lessons = new ArrayList<>();



    public Courses(String id, String title, String description, Instructor instructor ) {
        this.title = title;
        this.description = description;
        this.instructor = instructor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getId(){ return id; }

    public void addLesson(Lessons lesson) {
    }

    public String toString(){
        return "id: "+id +
                ", title: "+title+
                ", description: "+description;

    }
}