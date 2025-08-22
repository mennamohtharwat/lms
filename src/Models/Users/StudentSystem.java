package Models.Users;

import Models.Courses.Assignments;
import Models.Courses.Courses;
import java.util.ArrayList;

public class StudentSystem {
    private ArrayList<Courses> subscribedCourses = new ArrayList<>();
    private ArrayList<Assignments> submittedAssignments = new ArrayList<>();

    public void subscribeToCourse(Courses course) {
        subscribedCourses.add(course);
        System.out.println(" You have subscribed to the course :" + course.getTitle());
    }

    public void submitAssignment(Assignments assignment) {
        submittedAssignments.add(assignment);
        System.out.println("Assignment uploaded: " + assignment.getTitle());
    }

    public void viewGrade(Assignments assignment) {
        if (assignment.getGrade() != null) {
            System.out.println("the grade is :" + assignment.getGrade());
        } else {
            System.out.println("no grade yet " + assignment.getGrade());
        }
    }
}