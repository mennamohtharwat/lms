public class Student extends User {
    private String school;
    private String subscriptions;

    public Student() {
        super();
        this.school = "Unknown";
        this.subscriptions = "Not subscribed";
    }

    public Student(int id, String email, String pass, String name, String school, String subscriptions) {
        super(id, email, pass, name);
        this.school = school;
        this.subscriptions = subscriptions;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSubscriptions(String subscriptions) {
        this.subscriptions = subscriptions;
    }

    public String getSubscriptions() {
        return subscriptions;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("School: " + school);
        System.out.println("Subscriptions: " + subscriptions);
    }
}
