package Services.Courses;

import App.Database;
import Models.Courses.*;
import Models.Users.Student;
import Models.Users.Instructor;
import javax.xml.crypto.Data;
import java.util.ArrayList;

public class CoursesServices {
    //Instructor
    public boolean createCourse(Course course) {
        Database.courses.add(course);
        System.out.println("Course created: " + course.getTitle());
        return true;
    }

    public void updateCourse(String courseId, String newTitle, String newDescription) {
        for (Course course : Database.courses) {
            if (course.getId().equals(courseId)) {
                course.setTitle(newTitle);
                course.setDescription(newDescription);
                System.out.println("course updated :" + newTitle + newDescription);
                return;
            }
            System.out.println("course not found.");
        }
    }

    public boolean deleteCourse(String courseId) {
        Course courseToDelete = null;

        for (Course course : Database.courses) {
            if (course.getId().equals(courseId)) {
                courseToDelete = course;
                break;
            }
        }

        if (courseToDelete == null) {
            System.out.println("course not found.");
            return false;
        }

        Database.courses.removeIf(course -> course.getId().equals(courseId));

        for (Lesson lesson : courseToDelete.getLessons()) {
            Database.lessons.removeIf(item -> item.getId().equals(lesson.getId()));

            for (Assignment assignment : lesson.getAssignments()) {
                Database.assignments.removeIf(item -> item.getId().equals(assignment.getId()));
            }
        }

        System.out.println("Course deleted: " + courseToDelete.getTitle());
        return true;
    }

    public void addLessonToCourse(String title, Lesson lesson) {
        for (Course course : Database.courses) {
            if (course.getTitle().equals(title)) {
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
    public void createCourseSubscription(Course course, Student student) {
        Database.courseSubscriptions.add(new CourseSubscription(course, student));
        System.out.println(" You have subscribed to the course :" + course.getTitle());
    }

    public void assignmentSubmission(Student student, Assignment assignment) {
        Database.assignmentSubmissions.add(new AssignmentSubmission(student, assignment));
        System.out.println("Assignment uploaded: " + assignment.getTitle());
    }

    public void viewGrade(Assignment assignment) {
        if (assignment.getGrade() != null) {
            System.out.println("the grade is :" + assignment.getGrade());
        } else {
            System.out.println("no grade yet " + assignment.getGrade());
        }
    }

    public void listCourses() {
        if (Database.courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            System.out.println("Available courses:");
            for (Course course : Database.courses) {
                System.out.println(course);
            }
        }
    }
    public void listLessons() {
        for (Course course : Database.courses) {
            System.out.println("Course: " + course.getTitle());
            if (course.getLessons().isEmpty()) {
                System.out.println("  No lessons added yet.");
            } else {
                for (Lesson lesson : course.getLessons()) {
                    System.out.println("  Lesson: " + lesson.getTitle());
                }
            }
        }
    }

    public void listAssignments() {
        for (Course course : Database.courses) {
            System.out.println("Course: " + course.getTitle());
            for (Lesson lesson : course.getLessons()) {
                System.out.println("  Lesson: " + lesson.getTitle());
                if (lesson.getAssignments().isEmpty()) {
                    System.out.println("    No assignments yet.");
                } else {
                    for (Assignment assignment : lesson.getAssignments()) {
                        System.out.println("    Assignment: " + assignment.getTitle());
                    }
                }
            }
        }
    }

}