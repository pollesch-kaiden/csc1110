/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Exercise 11 - Files
 * Name: Kaiden Pollesch
 * Created: 11/29/2023
 */
package polleschk;

/**
 * Public Driver class for Exercise 11
 */
public class Driver {
    public static void main(String[] args) {
        Student student = new Student("Pollesch", "Kaiden");
        student.addCourse(Course.WRITING);
        student.addCourse(Course.SOFTDEV);
        student.addCourse(Course.HONORS);
        student.addCourse(Course.MATH);
        student.addCourse(Course.PHYSICS);
        student.addCourse(Course.MATHTWO);
        System.out.println(student.toString());
        student.removeCourse(Course.MATHTWO);
        System.out.println(student.toString());
    }
}
