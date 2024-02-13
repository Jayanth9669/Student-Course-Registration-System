import java.io.*;
import java.util.*;

public class CourseRemoval {
    private StudentRegistration studentRegistration;

    public CourseRemoval(StudentRegistration studentRegistration) {
        this.studentRegistration = studentRegistration;
    }

    public void removeStudentFromCourse(String id, String code) {
        Student student = studentRegistration.findStudent(id);
        Course course = studentRegistration.findCourse(code);
        if (student != null && course != null) {
            student.removeCourse(course);
            course.removeStudent();
            System.out.println("Successfully removed from course: " + course.getTitle());
        } else {
            System.out.println("Error: Could not find student or course.");
        }
    }
}
