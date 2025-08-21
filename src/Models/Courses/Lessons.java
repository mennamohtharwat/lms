package Models.Courses;

import java.util.ArrayList;
import java.util.UUID;

public class Lessons {
    private final String id = UUID.randomUUID().toString();
    private String title;
    private String content;
    private Courses course;
    private ArrayList<Assignments> assignment = new ArrayList<>();


    public Lessons(String id, String title, String content, Courses course) {
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

    @Override
    public String toString() {
         return  "id: " + id +
                ", title: " + title +
                ", content: " + content;

    }
}