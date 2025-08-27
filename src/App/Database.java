package App;

import Models.Courses.Assignment;
import Models.Courses.AssignmentSubmission;
import Models.Courses.Course;
import Models.Courses.CourseSubscription;
import Models.Users.User;
import java.util.ArrayList;

public class Database {
    public static ArrayList<Course> courses = new ArrayList<>();
    public static ArrayList<Assignment> assignments = new ArrayList<>();
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<CourseSubscription>courseSubscriptions = new ArrayList<>();
    public static ArrayList <AssignmentSubmission>assignmentSubmissions = new ArrayList<>();
}