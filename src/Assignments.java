public class Assignments {
private int id;
private String title;
private String content;
private int grade;
private Lessons lesson;

    public Assignments() {
        this.id = 0;
        this.title = "Unknown";
        this.content = "Unknown";
        this.grade = 0;
    }

    public Assignments(int id, String title, String content, Lessons lesson) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.lesson = lesson;
        this.grade = 0;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID");
        }
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

    public int getId() {
        return id;
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

    public void display(){
        System.out.println("id"+id);
        System.out.println("title"+title);
        System.out.println("content"+content);
        System.out.println("grade"+grade);
    }

    @Override
    public String toString() {
        return "id: "+id+
                ", title: "+title+
                ", content: "+content+
                ", grade: "+grade;
    }
}
