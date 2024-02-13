import java.io.*;
import java.util.*;

public class CourseListing {
    private List<Course> availableCourses;

    public CourseListing() {
        availableCourses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        availableCourses.add(course);
    }

    public void displayAvailableCourses() {
        System.out.println("Available Courses:");
        for (Course course : availableCourses) {
            System.out.println(course.getCode() + " - " + course.getTitle() + " (" + course.getNumRegistered() + "/"
                    + course.getCapacity() + ")");
        }
    }
}
