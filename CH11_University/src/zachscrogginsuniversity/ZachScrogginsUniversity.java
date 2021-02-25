// Student Name: Zach Scroggins
// Course: 2317 - Java Programming
// Date: 04/04/2020

package zachscrogginsuniversity;

import java.util.Scanner;

abstract class Person {

    private String firstName;
    private String lastName;
    private String emailAddress;

    public abstract void personalInterest();

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


class Student extends Person {

    private long studentId;
    private String major;
    private String studentLevel;

    @Override
    public void personalInterest() {
        System.out.println("You never told us what to do with this method");
    }

    public Student() {
        this.studentId = 0;
        this.major = "";
        this.studentLevel = "";
    }

    public Student(long studentId) {
        this.studentId = studentId;
        this.major = "";
        this.studentLevel = "";
    }

    public Student(String major, String studentLevel) {
        this.studentId = 0;
        this.major = major;
        this.studentLevel = studentLevel;
    }

    public Student(long studentId, String major, String studentLevel) {
        this.studentId = studentId;
        this.major = major;
        this.studentLevel = studentLevel;
    }

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
        System.out.println("\n*** STUDENT INFORMATION ***");
        System.out.print("\nFirst Name: ");
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
        System.out.println("\nName: " + getFirstName() + " " + getLastName());
        System.out.println("Email Address: " + getEmailAddress());
        System.out.println("Student Id: " + this.studentId);
        System.out.println("Major: " + this.major);
        System.out.println("Student Level: " + this.studentLevel);
    }
}


class Instructor extends Person {
    private long SSN;
    private String subject;
    private long yearsWorked;

    @Override
    public void personalInterest() {
        System.out.println("You never told us what to do with this method");
    }

    public Instructor() {
        this.SSN = 0;
        this.subject = "";
        this.yearsWorked = 0;
    }

    public Instructor(String subject) {
        this.SSN = 0;
        this.subject = subject;
        this.yearsWorked = 0;
    }

    public Instructor(long SSN, long yearsWorked) {
        this.SSN = SSN;
        this.subject = "";
        this.yearsWorked = yearsWorked;
    }

    public Instructor(long SSN, String subject, long yearsWorked) {
        this.SSN = SSN;
        this.subject = subject;
        this.yearsWorked = yearsWorked;
    }


    public void addInstructor() {
        Scanner input = new Scanner(System.in);
        String userValue = "";
        System.out.println("\n*** INSTRUCTOR INFORMATION ***");
        System.out.print("\nFirst Name: ");
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
        System.out.println("\nName: " + getFirstName() + " " + getLastName());
        System.out.println("Email Address: " + getEmailAddress());
        System.out.println("Social Security Number: " + this.SSN);
        System.out
                .println("Subject Area: " + this.subject + " for " + this.yearsWorked + " years.");
    }
}


public class ZachScrogginsUniversity {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        Instructor[] instructor = new Instructor[5];
        String flag = "";
        String userValue = "";
        Scanner userInput = new Scanner(System.in);
        int x = 0;
        int y = 0;

        do {
            System.out.print("\nAdd student or instructor (s/i)?");
            userValue = userInput.nextLine();

            if ("s".equalsIgnoreCase(userValue)) {
                if (x < student.length) {
                    student[x] = new Student();
                    student[x].addStudent();
                    x++;
                } else {
                    System.out.println("You have added the maximum number of students");
                }

            } else if ("i".equalsIgnoreCase(userValue)) {
                if (y < instructor.length) {
                    instructor[y] = new Instructor();
                    instructor[y].addInstructor();
                    y++;
                } else {
                    System.out.println("You have added the maximum number of instructors");
                }
            } else {
                System.out.println("ERROR: Invalid Entry");
            }

            System.out.print("\nDisplay students or instructors (s/i)?");
            userValue = userInput.nextLine();
            if ("s".equalsIgnoreCase(userValue)) {
                System.out.println("\n*** DISPLAY STUDENT INFORMATION ***");
                for (int i = 0; i < x; i++) {
                    student[i].showStudent();
                }
            } else if ("i".equalsIgnoreCase(userValue)) {
                System.out.println("\n*** DISPLAY INSTRUCTOR INFORMATION ***");
                for (int i = 0; i < y; i++) {
                    instructor[i].showInstructor();
                }
            }

            System.out.print("\nWould you like to continue or exit(c/x):");
            flag = userInput.nextLine();
        } while (flag.equalsIgnoreCase("C"));
    }
}
