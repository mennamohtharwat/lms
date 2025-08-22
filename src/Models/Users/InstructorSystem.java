package Models.Users;

import Models.Courses.Courses;
import Models.Courses.Lessons;
import Models.Courses.Assignments;
import java.util.ArrayList;

public class InstructorSystem {
    private ArrayList<Courses> courses = new ArrayList<>();

    public void createCourse(Courses course) {
        courses.add(course);
        System.out.println("Course created: " + course.getTitle());
    }

    public void updateCourse(String courseId, String newTitle, String newDescription) {
        for (Courses courses : courses) {
            if (courses.getId() == courseId) {
              courses.setTitle(newTitle);
              courses.setDescription(newDescription);
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

    public void addLessonToCourse(String courseId, Lessons lesson) {
        for (Courses course : courses) {
            if (course.getId() == courseId) {
                course.addLesson(lesson);
                System.out.println("Lesson added to course: " + course.getTitle());
                return;
            }
        }
        System.out.println("Course not found.");
    }
    public void addAssignmentToLesson(Lessons lesson, Assignments assignment) {
        lesson.addAssignment(assignment);
        System.out.println("Assignment added to lesson: " + lesson.getTitle());
    }

    public void addGradeToAssignment(Assignments assignment, double grade) {
        assignment.setGrade(grade);
        System.out.println("Grade " + grade + " added to assignment: " + assignment.getTitle());
    }
}