import java.io.*;
import java.util.*;

public class StudentRegistration {
    private CourseListing courseListing;
    private List<Student> students;

    public StudentRegistration() {
        courseListing = new CourseListing();
        students = new ArrayList<>();
    }

    public void registerStudent(String id, String name) {
        Student student = new Student(id, name);
        students.add(student);
    }

    public void registerForCourse(String id, String code) {
        Student student = findStudent(id);
        Course course = findCourse(code);
        if (student != null && course != null && course.addStudent()) {
            student.addCourse(course);
            System.out.println("Registered for course: " + course.getTitle());
        } else {
            System.out.println("Error: Could not register for course.");
        }
    }

    private Student findStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    private Course findCourse(String code) {
        for (Course course : courseListing.getAvailableCourses()) {
            if (course.getCode().equals(code)) {
                return course;
            }
        }
        return null;
    }
}
