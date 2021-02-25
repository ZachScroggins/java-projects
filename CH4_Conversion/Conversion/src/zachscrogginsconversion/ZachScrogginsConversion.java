// Student Name: Zach Scroggins
// Course: 2317 - Java Programming
// Date: 02/14/2020

package zachscrogginsconversion;

import java.util.Scanner;
import java.util.*;

public class ZachScrogginsConversion {
    private static final long FUTURE_YEAR = 2050;
    private String name;
    private long year;
    private double height;
    private double weight;

    public ZachScrogginsConversion() {
        name = "";
        year = 0;
        height = 0.0;
        weight = 0.0;
    }

    public ZachScrogginsConversion(String name, long year, double height, double weight) {
        this.name = name;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    void setName(String name) {
        this.name = name;
    }

    void setYear(long year) {
        this.year = year;
    }

    void setHeight(double height) {
        this.height = height;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    String getName() {
        return name;
    }

    long getYear() {
        return year;
    }

    double getHeight() {
        return height;
    }

    double getWeight() {
        return weight;
    }

    static long getFutureYear() {
        return FUTURE_YEAR;
    }

    long computeAge() {
        GregorianCalendar now = new GregorianCalendar();
        return (now.get(GregorianCalendar.YEAR) - year);
    }

    double convertHeight() {
        return (height * 2.54);
    }

    double convertWeight() {
        return (weight / 2.205);
    }

    long computeAge(long year) {
        return FUTURE_YEAR - year;
    }

    public static void main(String[] args) {

        String userName = "";
        long Year = 0;
        double Height = 0.0;
        double Weight = 0.0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your name? : ");
        userName = keyboard.nextLine();
        System.out.print("Enter your 4 digit birth year : ");
        Year = keyboard.nextLong();
        System.out.print("Enter your height in inches : ");
        Height = keyboard.nextDouble();
        System.out.print("Enter your weight in pounds : ");
        Weight = keyboard.nextDouble();

        keyboard.close();

        ZachScrogginsConversion obj = new ZachScrogginsConversion(userName, Year, Height, Weight);

        System.out.println(obj.getName() + " you are " + obj.computeAge() + " years old, "
                + obj.convertHeight() + " cm tall, and weigh " + obj.convertWeight()
                + " kilograms.");

        System.out.println(obj.getName() + " will be " + obj.computeAge(Year) + " by the year "
                + ZachScrogginsConversion.getFutureYear() + ".");

    }
}
