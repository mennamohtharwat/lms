import Models.Courses.Assignment;
import Models.Courses.Course;
import Models.Courses.Lesson;
import Models.Users.Instructor;
import Models.Users.Student;
import Services.Courses.CoursesServices;
import Services.Users.UserServices;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        UserServices userServices = new UserServices();
        CoursesServices coursesServices = new CoursesServices();

        Instructor inst1 = new Instructor("Ahmed@gmail.com", "1234", "Ahmed", "Java Expert", "No Courses");
        Instructor inst2 = new Instructor("Sara@gmail.com", "5678", "Sara", "Python Expert", "No Courses");

        Student stud1 = new Student("Ali@gmail.com", "1111", "Ali", "Cairo University", "None");
        Student stud2 = new Student("Mona@gmail.com", "2222", "Mona", "Alex University", "None");

        userServices.signUp(inst1);
        userServices.signUp(inst2);
        userServices.signUp(stud1);
        userServices.signUp(stud2);

        Course course1 = new Course("Java Basics", "Programming 1", inst1);
        Course course2 = new Course("Advanced Java", "Programming 2 (OOP)", inst1);
        Course course3 = new Course("Python Basics", "Intro to Python", inst2);
        Course course4 = new Course("Data Science", "OOP in Java", inst2);

        coursesServices.createCourse(course1);
        coursesServices.createCourse(course2);
        coursesServices.createCourse(course3);
        coursesServices.createCourse(course4);

        coursesServices.listCourses();

        Lesson lesson1 = new Lesson("L1", "Introduction to Java", course1);
        Lesson lesson2 = new Lesson("L2", "OOP in Java", course2);
        Lesson lesson3 = new Lesson("L3", "Python Syntax", course3);
        Lesson lesson4 = new Lesson("L4", "Data Science for beginners", course4);

        coursesServices.addLessonToCourse("Java Basics", lesson1);
        coursesServices.addLessonToCourse("Advanced Java", lesson2);
        coursesServices.addLessonToCourse("Python Basics", lesson3);
        coursesServices.addLessonToCourse("Data Science", lesson4);

        coursesServices.listLessons();

        Assignment assignment1 = new Assignment("A1", "Introduction to Java", lesson1);
        Assignment assignment2 = new Assignment("A2", "OOP in Java", lesson2);
        Assignment assignment3 = new Assignment("A3", "Python Syntax", lesson3);
        Assignment assignment4 = new Assignment("A4", "Data Science for beginners", lesson4);

        coursesServices.addAssignmentToLesson(lesson1, assignment1);
        coursesServices.addAssignmentToLesson(lesson2, assignment2);
        coursesServices.addAssignmentToLesson(lesson3, assignment3);
        coursesServices.addAssignmentToLesson(lesson4, assignment4);

        coursesServices.listAssignments();

        coursesServices.createCourseSubscription(course1, stud1);
        coursesServices.createCourseSubscription(course2, stud1);
        coursesServices.createCourseSubscription(course3, stud2);
        coursesServices.createCourseSubscription(course4, stud2);

        coursesServices.assignmentSubmission(stud1, assignment1);
        coursesServices.assignmentSubmission(stud1, assignment2);
        coursesServices.assignmentSubmission(stud2, assignment3);
        coursesServices.assignmentSubmission(stud2, assignment4);
    }
}