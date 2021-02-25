// Student Name: Zach Scroggins
// Course: 2317 - Java Programming
// Date: 03/29/2020

package zachscrogginscollege;

import java.util.Scanner;

// Person CLASS
class Person {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Person() {
        // initialize the three class attributes firstName, lastName, emailAddress
        this.firstName = "";
        this.lastName = "";
        this.emailAddress = "";
    }

    public Person(String emailAddress) {
        this.firstName = "";
        this.lastName = "";
        this.emailAddress = emailAddress;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = "";
    }

    public Person(String firstName, String lastName, String emailAddress) {
        // initialize the three class attributes firstName, lastName, emailAddress
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    // Create setters and getters for firstName, lastName, emailAddress
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

}



// Instructor CLASS
class Instructor extends Person {

    private long SSN;
    private String subject;
    private long yearsWorked;

    public Instructor() {
        this.SSN = 0;
        this.subject = "";
        this.yearsWorked = 0;
    }

    public Instructor(String subject) {
        // initialize the class attibutes SSN, subject, yearsWorked
        this.SSN = 0;
        this.subject = subject;
        this.yearsWorked = 0;
    }

    public Instructor(long SSN, long yearsWorked) {
        // initialize the class attibutes SSN, subject, yearsWorked
        this.SSN = SSN;
        this.subject = "";
        this.yearsWorked = yearsWorked;
    }

    public Instructor(long SSN, String subject, long yearsWorked) {
        // initialize the class attibutes SSN, subject, yearsWorked
        this.SSN = SSN;
        this.subject = subject;
        this.yearsWorked = yearsWorked;
    }

    // Create setters and getters for SSN, subject, yearsWorked

    public void addInstructor() {
        Scanner input = new Scanner(System.in);
        String userValue = "";
        System.out.println("*** INSTRUCTOR INFORMATION ***");
        System.out.print("First Name: ");
        userValue = input.nextLine();
        setFirstName(userValue);
        System.out.print("Last Name: ");
        userValue = input.nextLine();
        setLastName(userValue);
        System.out.print("Email Address: ");
        userValue = input.nextLine();
        setEmailAddress(userValue);
        System.out.print("SSN: ");
        this.SSN = input.nextLong();
        input.nextLine();
        System.out.print("Subject: ");
        this.subject = input.nextLine();
        System.out.print("Years Worked: ");
        this.yearsWorked = input.nextLong();
        input.nextLine();
    }

    public void showInstructor() {
        System.out.println("*** DISPLAY INSTRUCTOR INFORMATION ***");
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Email Address: " + getEmailAddress());
        System.out.println("Social Security Number: " + this.SSN);
        System.out
                .println("Subject Area: " + this.subject + " for " + this.yearsWorked + " years.");
    }
}



// Student CLASS
class Student extends Person {

    private long studentId;
    private String major;
    private String studentLevel;

    // Complete the constructor. Initialize the attributes studentID, major, studentLevel
    public Student() {
        this.studentId = 0;
        this.major = "";
        this.studentLevel = "";
    }

    // Complete the overloaded constructor.Initialize the attributes studentID, major, studentLevel
    public Student(long studentId) {
        this.studentId = studentId;
        this.major = "";
        this.studentLevel = "";
    }

    // Complete the overloaded constructor.Initialize the attributes studentId, major, studentLevel
    public Student(String major, String studentLevel) {
        this.studentId = 0;
        this.major = major;
        this.studentLevel = studentLevel;
    }

    // Complete the overloaded constructor.Initialize the attributes studentId, major, studentLevel
    public Student(long studentId, String major, String studentLevel) {
        this.studentId = studentId;
        this.major = major;
        this.studentLevel = studentLevel;
    }

    // Create setters and getters for studentId, major, studentLevel
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getStudentId() {
        return this.studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return this.major;
    }

    public void setStudentLevel(String studentLevel) {
        this.studentLevel = studentLevel;
    }

    public String getStudentLevel() {
        return this.studentLevel;
    }

    public void addStudent() {
        Scanner input = new Scanner(System.in);
        String userValue = "";
        System.out.println("*** STUDENT INFORMATION ***");
        System.out.print("First Name: ");
        userValue = input.nextLine();
        setFirstName(userValue);
        System.out.print("Last Name: ");
        userValue = input.nextLine();
        setLastName(userValue);
        System.out.print("Email Address: ");
        userValue = input.nextLine();
        setEmailAddress(userValue);
        System.out.print("Student Id: ");
        studentId = input.nextLong();
        input.nextLine();
        System.out.print("Major: ");
        this.major = input.nextLine();
        System.out.print("Student Level: ");
        this.studentLevel = input.nextLine();
    }

    public void showStudent() {
        System.out.println("*** DISPLAY STUDENT INFORMATION ***");
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Email Address: " + getEmailAddress());
        System.out.println("Student Id: " + this.studentId);
        System.out.println("Major: " + this.major);
        System.out.println("Student Level: " + this.studentLevel);
    }
}



// COLLEGE CLASS
public class ZachScrogginsCollege {
    // Create a class attribute called student of type Student
    private Student student;
    // Create a class attribute called instructor of type Instructor
    private Instructor instructor;

    public ZachScrogginsCollege() {
        this.student = new Student();
        this.instructor = new Instructor();
    }

    public ZachScrogginsCollege(Student student) {
        this.student = student;
        this.instructor = new Instructor();
    }

    public ZachScrogginsCollege(Instructor instructor) {
        this.student = new Student();
        this.instructor = instructor;
    }

    public ZachScrogginsCollege(Student student, Instructor instructor) {
        this.student = student;
        this.instructor = instructor;
    }

    public ZachScrogginsCollege(Instructor instructor, Student student) {
        this.student = student;
        this.instructor = instructor;
    }

    // Create setters and getters for student and instructor
    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void addSudent() {
        student.addStudent();
    }

    public void addInstructor() {
        instructor.addInstructor();
    }

    public void displayStudent() {
        student.showStudent();
    }

    public void displayInstructor() {
        instructor.showInstructor();
    }
    // --------------

    /**
     * *** MAIN LOGIC
     *
     * @param args
     */
    public static void main(String[] args) {
        String flag = "";
        String userValue = "";
        ZachScrogginsCollege Baylor = new ZachScrogginsCollege();
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.print("\nAdd student or instructor (s/i)?");
            userValue = userInput.nextLine();

            if ("s".equalsIgnoreCase(userValue)) {
                Student student = new Student();
                student.addStudent();
                Baylor.setStudent(student);

            } else if ("i".equalsIgnoreCase(userValue)) {
                Instructor instructor = new Instructor();
                instructor.addInstructor();
                Baylor.setInstructor(instructor);
            } else {
                System.out.println("ERROR: Invalid Entry");
            }

            System.out.print("\nDisplay student or instructor (s/i)?");
            userValue = userInput.nextLine();
            if ("s".equalsIgnoreCase(userValue)) {
                Baylor.getStudent();
                Baylor.displayStudent();
            } else if ("i".equalsIgnoreCase(userValue)) {
                Baylor.getInstructor();
                Baylor.displayInstructor();
            }

            System.out.print("\nWould you like to continue or exit(c/x):");
            flag = userInput.nextLine();
        } while (flag.equalsIgnoreCase("C"));
    }

}
