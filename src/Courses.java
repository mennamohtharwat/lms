public class Courses {
    private int id;
    private String title;
    private String description;
    private Instructor instructor;

    public Courses() {
        this.id = 0;
        this.title = "Unknown";
        this.description = "Have no description";
    }

    public Courses(int id, String title, String description, Instructor instructor ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.instructor = instructor;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void display(){
        System.out.println("id"+id);
        System.out.println("title"+title);
        System.out.println("description"+description);
    }
    public String toString(){
        return "id: "+id +
                ", title: "+title+
                ", description: "+description;

    }
}