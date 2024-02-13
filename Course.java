import java.io.*;
import java.util.*;

public class Course implements Serializable {
    private String code;
    private String title;
    private String description;
    private int capacity;
    private int numRegistered;
    private String schedule;

    public Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.numRegistered = 0;
    }

    // Getters and setters for each field

    public boolean addStudent() {
        if (numRegistered < capacity) {
            numRegistered++;
            return true;
        }
        return false;
    }

    public boolean removeStudent() {
        if (numRegistered > 0) {
            numRegistered--;
            return true;
        }
        return false;
    }
}