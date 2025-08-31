package Models.Courses;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Lesson {
    private final String id = UUID.randomUUID().toString();
    private String title;
    private String content;
    private Course course;
    private ArrayList<Assignment> assignment = new ArrayList<>();


    public Lesson(String id, String title, String content, Course course) {
        this.title = title;
        this.content = content;
        this.course = course;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void addAssignment(Assignment assignment) {
    }

    public List<Assignment> getAssignments() {
        return assignment;
    }

    @Override
    public String toString() {
         return  "id: " + id +
                ", title: " + title +
                ", content: " + content;

    }
}