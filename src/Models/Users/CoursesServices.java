package Models.Users;

import Models.Courses.*;
import java.util.ArrayList;
import App.Database;

public class CoursesServices {
    private ArrayList<CourseSubscription> courseSubscriptions = Database.courseSubscriptions;
    private ArrayList<AssignmentSubmission>assignmentSubmissions = Database.assignmentSubmissions;
    private ArrayList<Course> courses = Database.courses;
    private ArrayList<Assignment> assignments = Database.assignments;

   //Instructor
    public void createCourse(Course course) {
        courses.add(course);
        System.out.println("Course created: " + course.getTitle());
    }

    public void updateCourse(String courseId, String newTitle, String newDescription) {
        for (Course course : courses) {
            if (course.getId() == courseId) {
              course.setTitle(newTitle);
              course.setDescription(newDescription);
                System.out.println("course updated :"+newTitle +newDescription);
                return;
            }
            System.out.println("course not found.");
        }
    }
    public void deleteCourse(String courseId) {
        courses.removeIf(course -> course.getId() == courseId);
        System.out.println("Course deleted with ID: " + courseId);
    }

    public void addLessonToCourse(String courseId, Lesson lesson) {
        for (Course course : courses) {
            if (course.getId() == courseId) {
                course.addLesson(lesson);
                System.out.println("Lesson added to course: " + course.getTitle());
                return;
            }
        }
        System.out.println("Course not found.");
    }
    public void addAssignmentToLesson(Lesson lesson, Assignment assignment) {
        lesson.addAssignment(assignment);
        System.out.println("Assignment added to lesson: " + lesson.getTitle());
    }

    public void addGradeToAssignment(Assignment assignment, double grade) {
        assignment.setGrade(grade);
        System.out.println("Grade " + grade + " added to assignment: " + assignment.getTitle());
    }

  //Student
    public void createCourseSubscription(Course course , Student student) {
        courseSubscriptions.add(new CourseSubscription(course,student));
        System.out.println(" You have subscribed to the course :" + course.getTitle());
    }

    public void assignmentSubmission(Student student , Assignment assignment) {
        assignmentSubmissions.add(new AssignmentSubmission(student ,assignment));
        System.out.println("Assignment uploaded: " + assignment.getTitle());
    }

    public void viewGrade(Assignment assignment) {
        if (assignment.getGrade() != null) {
            System.out.println("the grade is :" + assignment.getGrade());
        } else {
            System.out.println("no grade yet " + assignment.getGrade());
        }
    }
}