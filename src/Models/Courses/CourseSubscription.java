package Models.Courses;

import Models.Users.User;
import java.util.UUID;

public class CourseSubscription {
    private final String id = UUID.randomUUID().toString();
    private Course course ;
    private User user ;

    public CourseSubscription(Course course , User user) {
        this.course = course;
        this.user = user;
    }
}
