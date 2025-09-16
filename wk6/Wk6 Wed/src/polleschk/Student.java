package polleschk;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Student {
    private int age;
    private int height;
    private String firstName;
    private String lastName;

    public Student(String studentInfo) {
        int firstSpace = studentInfo.indexOf(" ");
        int firstComma = studentInfo.indexOf(",");
        int lastComma = studentInfo.lastIndexOf(",");
        firstName = studentInfo.substring(0, firstSpace);
        lastName = studentInfo.substring(firstSpace + 1, firstComma);
        age = Integer.parseInt(studentInfo.substring(firstComma + 2, lastComma));
        height = Integer.parseInt(studentInfo.substring(lastComma + 2));


    }
}