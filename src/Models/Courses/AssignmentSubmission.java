package Models.Courses;

import Models.Users.Student;
import Models.Users.User;
import java.util.UUID;

public class AssignmentSubmission {
    private final String id = UUID.randomUUID().toString();
    private Student student;
    private Assignment assignment;

    public AssignmentSubmission(Student student,Assignment assignment ) {
        this.student=student ;
        this.assignment = assignment;
    }
}