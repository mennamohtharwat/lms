public class Lessons {
    private int id;
    private String title;
    private String content;
    private Courses course;

    public Lessons() {
        this.id = 0;
        this.title = "Unknown";
        this.content = "Unknown";
    }

    public Lessons(int id, String title, String content, Courses course) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.course = course;
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

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

public void display(){
    System.out.println("id"+id);
    System.out.println("title"+title);
    System.out.println("content"+content);
}

    @Override
    public String toString() {
         return  "id: " + id +
                ", title: " + title +
                ", content: " + content;

    }
}