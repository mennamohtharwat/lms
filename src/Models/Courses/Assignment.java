package Models.Courses;

import java.util.UUID;

public class Assignment {
    private final String id = UUID.randomUUID().toString();
    private String title;
    private String content;
    private Double grade;
    private final Lesson lesson;

    public Assignment(String id, String title, String content, Lesson lesson) {
        this.title = title;
        this.content = content;
        this.lesson = lesson;
        this.grade = null;
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

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", title: " + title +
                ", content: " + content +
                ", grade: " + grade;
    }
}
