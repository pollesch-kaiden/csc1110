/*
 * Course: CSC1011 - 171
 * Fall 2023
 * Exercise 11 - Files
 * Name: Kaiden Pollesch
 * Created: 11/29/2023
 */
package polleschk;

/**
 * Public enum Courses
 */
public enum Course {
    /**
     * Calculus 1 Mah Course
     */
    MATH("MTH-1110", "Calculus I", 4),
    /**
     * Software Development Course
     */
    SOFTDEV("CSC-1110", "Software Development", 4),
    /**
     * Honors Seminar 1 Course
     */
    HONORS("HON-2051", "Honors Seminar 1", 3),
    /**
     * College Writing Course
     */
    WRITING("COM-1001", "College Writing", 3),
    /**
     * Physics 1 Course
     */
    PHYSICS("PHY-1110", "Physics 1", 4),
    /**
     * Calculus II Course
     */
    MATHTWO("MTH-1120", "Calculus II", 4);
    private final String code;
    private final String title;
    private final int credits;

    Course(String code, String title, int credits){
        this.code = code;
        this.title = title;
        this.credits = credits;
    }
    public String getCode(){
        return code;
    }
    public int getCredits(){
        return credits;
    }

    /**
     * The course code, title, and credits are put in string form.
     * @return the code in string form
     */
    public String toString(){
        String strCode = String.format("%8s ", getCode());
        String strTitle = String.format("%25s ", title);
        String strCredits = String.format("%d", getCredits());
        return strCode + strTitle + strCredits;
    }
}
