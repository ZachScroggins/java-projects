// Student Name: Zach Scroggins
// Course: 2317 - Java Programming
// Date: 02/20/2020

package zachscrogginschoices;

import java.util.Scanner;

public class ZachScrogginsChoices {

    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;
    private int weekDay;

    public ZachScrogginsChoices() {
        quarters = 0;
        dimes = 0;
        nickels = 0;
        pennies = 0;
        weekDay = 0;
    }

    // Write a setter for each attribute
    public void setQuarters(int cents) {
        quarters = cents;
    }

    public void setDimes(int cents) {
        dimes = cents;
    }

    public void setnickels(int cents) {
        nickels = cents;
    }

    public void setPennies(int cents) {
        pennies = cents;
    }

    public void setWeekDay(int day) {
        weekDay = day;
    }

    // Write a getter for each attribute
    public int getQuarters() {
        return quarters;
    }

    public int getDimes() {
        return dimes;
    }

    public int getnickels() {
        return nickels;
    }

    public int getPennies() {
        return pennies;
    }

    public int getWeekDay() {
        return weekDay;
    }

    // Complete the logic for the method
    public void convertMoney() {
        Scanner in = new Scanner(System.in);
        int cents = 0;

        System.out.println("Welcome to the Change Calculator");
        System.out.print("\nEnter the number of cents (0-99): ");
        cents = in.nextInt();
        if (cents < 0 || cents > 99) {
            System.out.println(cents + " amount invalid.");
            System.out.println("Value must be between 0 and 99.");
            System.out.println("");
            System.out.print("Please enter a valid number (0-99): ");
            cents = in.nextInt();
            if (cents < 0 || cents > 99) {
                System.out.println("You have exceeded the number of tries. Goodbye.");
                System.exit(0);
            }
        }

        setQuarters(cents / 25);
        cents = cents % 25;
        setDimes(cents / 10);
        cents = cents % 10;
        setnickels(cents / 5);
        cents = cents % 5;
        setPennies(cents);

        System.out.println("");
        System.out.println("Quarters: " + getQuarters());
        System.out.println("Dimes: " + getDimes());
        System.out.println("nickels: " + getnickels());
        System.out.println("Pennies: " + getPennies());
        System.out.println("");
    }

    public void selectDay() {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the Day Selector");
        System.out.print("Enter a number for the day (1-7): ");
        setWeekDay(in.nextInt());

        switch (getWeekDay()) {
            case 1:
                System.out.println("Sunday: weekend!");
                break;
            case 2:
                System.out.println("Monday: weekday");
                break;
            case 3:
                System.out.println("Tuesday: weekday");
                break;
            case 4:
                System.out.println("Wednesday: weekday");
                break;
            case 5:
                System.out.println("Thursday: weekday");
                break;
            case 6:
                System.out.println("Friday: weekday");
                break;
            case 7:
                System.out.println("Saturday: weekend!");
                break;
            default:
                System.out.println("Invalid day");
        }

        in.close();

    }

    public static void main(String[] args) {
        String firstName;
        String lastName;
        int input;
        Scanner in = new Scanner(System.in);
        ZachScrogginsChoices Obj = new ZachScrogginsChoices();

        System.out.print("Enter your first name: ");
        firstName = in.nextLine();
        System.out.print("Enter your last name : ");
        lastName = in.nextLine();
        System.out.println("Hello " + firstName + " " + lastName + ".");
        System.out.println("");

        System.out.println("Press 1 - Calculate coins for change");
        System.out.println("Press 2 - Determine the day of the week");
        System.out.println("Press 3 - Both");

        input = in.nextInt();

        switch (input) {
            case 1:
                Obj.convertMoney();
                break;
            case 2:
                Obj.selectDay();
                break;
            case 3:
                Obj.convertMoney();
                Obj.selectDay();
                break;
            default:
                System.out.println(input + " is invalid");
        }

        in.close();

        System.out.println("");
        System.out.println("Thank you. GoodBye");
    }

}
