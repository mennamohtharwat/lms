package Models.Courses;

import java.util.UUID;

public class Assignments {
    private final String id = UUID.randomUUID().toString();
private String title;
private String content;
private int grade;
private Lessons lesson;

   public Assignments(String id, String title, String content, Lessons lesson) {
       this.title = title;
        this.content = content;
        this.lesson = lesson;
        this.grade = 0;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "id: "+id+
                ", title: "+title+
                ", content: "+content+
                ", grade: "+grade;
    }
}
