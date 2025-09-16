/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Exercise 11 - Files
 * Name: Kaiden Pollesch
 * Created: 11/29/2023
 */
package polleschk;

import java.util.ArrayList;
import java.util.List;

/**
 * Public class student
 */
public class Student {
    private final String lastName;
    private final String firstName;
    private final List<Course> courses;

    /**
     * Public Student constructor with the following parameters
     * @param lastName the last name of the student
     * @param firstName the first name of the student
     */
    public Student(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
        courses = new ArrayList<>();
    }

    /**
     * add a course to the courses list and return nothing.
     * @param course take in the course that they are looking to add to their schedule
     */
    public void addCourse(Course course){
        this.courses.add(course);
    }

    /**
     * remove a course to the courses list and return nothing
     * @param course take in the course that they are looking to remove from their schedule
     */
    public void removeCourse(Course course){
        this.courses.remove(course);
    }

    /**
     * put their semester schedule to string
     * @return the schedule for that student with their credits and course codes
     */
    public String toString(){
        StringBuilder builder = new StringBuilder();
        int totalCredits = 0;
        builder.append(String.format("%s, %s\n", firstName, lastName));
        builder.append("""
                Course                       Title Credits
                ======== ========================= =======
                """);
        for (Course course : courses) {
            builder.append(course.toString()).append("\n");
            totalCredits += course.getCredits();
        }
        builder.append(String.format("==========================================\n" +
                "                                   %d", totalCredits));
        return builder.toString();
    }
}
