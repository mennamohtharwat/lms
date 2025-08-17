package Models.Users;

public class Student extends User {
    private String school;
    private String subscriptions;

    public Student(String email, String pass, String name, String school, String subscriptions) {
        super(email, pass, name);
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
    public String toString() {
        return super.toString()+
                ", school: "+school+
                ", Subscriptions: "+subscriptions;
    }
}