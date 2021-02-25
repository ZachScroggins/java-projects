// Student Name: Zach Scroggins
// Course: 2317 - Java Programming
// Date: 02/07/2020

package zachscrogginstriangle;

import java.util.Scanner;

public class ZachScrogginsTriangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double base;
    private double height;

    public ZachScrogginsTriangle() {
        sideOne = 0;
        sideTwo = 0;
        sideThree = 0;
        base = 0;
        height = 0;
    }

    public ZachScrogginsTriangle(double sideOne, double sideTwo, double sideThree, double base,
            double height) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.base = base;
        this.height = height;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideOne() {
        return this.sideOne;
    }

    public double getSideTwo() {
        return this.sideTwo;
    }

    public double getSideThree() {
        return this.sideThree;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    public double calculateArea() {
        return (.5 * (this.base * this.height));
    }

    public double calculatePerimeter() {
        return (this.sideOne + this.sideTwo + this.sideThree);
    }

    public static void main(String[] args) {
        double firstNumber = 0;
        double secondNumber = 0;
        double thirdNumber = 0;
        double baseNumber = 0;
        double heightNumber = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("\nEnter side one : ");
        firstNumber = keyboard.nextDouble();
        System.out.print("Enter side two : ");
        secondNumber = keyboard.nextDouble();
        System.out.print("Enter side three : ");
        thirdNumber = keyboard.nextDouble();

        System.out.print("\nEnter the base : ");
        baseNumber = keyboard.nextDouble();
        System.out.print("Enter the height : ");
        heightNumber = keyboard.nextDouble();

        keyboard.close();

        ZachScrogginsTriangle triangleObj = new ZachScrogginsTriangle();
        triangleObj.setSideOne(firstNumber);
        triangleObj.setSideTwo(secondNumber);
        triangleObj.setSideThree(thirdNumber);
        triangleObj.setBase(baseNumber);
        triangleObj.setHeight(heightNumber);

        ZachScrogginsTriangle triangleObj2 = new ZachScrogginsTriangle(firstNumber, secondNumber,
                thirdNumber, baseNumber, heightNumber);

        System.out.println("\nWITH DEFAULT CONSTRUCTOR");
        System.out.println("The area is : " + triangleObj.calculateArea());
        System.out.println("The perimeter is : " + triangleObj.calculatePerimeter());
        System.out.println("\nWITH OVERLOADED CONSTRUCTOR");
        System.out.println("The area is : " + triangleObj2.calculateArea());
        System.out.println("The perimeter is : " + triangleObj2.calculatePerimeter());
        System.out.println("\nGoodBye");
    }
}
