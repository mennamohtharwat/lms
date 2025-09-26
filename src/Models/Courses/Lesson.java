package Models.Courses;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Lesson {
    private final String id = UUID.randomUUID().toString();
    private String title;
    private String content;
    private final Course course;
    private final ArrayList<Assignment> assignment = new ArrayList<>();

    public Lesson( String title, String content, Course course) {
        this.title = title;
        this.content = content;
        this.course = course;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void addAssignment(Assignment assignment) {
        this.assignment.add(assignment);
    }

    public List<Assignment> getAssignments() {
        return assignment;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", title: " + title +
                ", content: " + content;

    }
}