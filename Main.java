import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Initialize course listing
        CourseListing courseListing = new CourseListing();
        courseListing.addCourse(new Course("CSC101", "Introduction to Computer Science", "Introduction to the basics of computer science", 30, "MWF 10:00-11:00"));
        courseListing.addCourse(new Course("MTH101", "Calculus I", "Introduction to single variable calculus", 40, "TTh 09:00-10:30"));

        // Initialize student registration
        StudentRegistration studentRegistration = new StudentRegistration();

        // Register students
        studentRegistration.registerStudent("123456", "John Doe");
        studentRegistration.registerStudent("234567", "Jane Doe");

        // Display available courses
        courseListing.displayAvailableCourses();

        // Register students for courses
        studentRegistration.registerForCourse("123456", "CSC101");
        studentRegistration.registerForCourse("234567", "MTH101");

        // Remove a student from a course
        studentRegistration.getCourseRemoval().removeStudentFromCourse("123456", "CSC101");

        // Display available courses again
        courseListing.displayAvailableCourses();
    }
