public class Instructor extends User {
    private String bio;
    private String courses;

    public Instructor() {
        super();
        this.bio = "No bio available.";
        this.courses = "There are no courses";
    }

    public Instructor(int id, String email, String pass, String name, String bio, String courses) {
        super(id, email, pass, name);
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
    public void display() {
        super.display();
        System.out.println("Bio: " + bio);
        System.out.println("Courses: " + courses);
    }

    @Override
    public String toString() {
        return super.toString()+
                ", bio: "+bio+
                ", courses: "+courses;

    }
}
