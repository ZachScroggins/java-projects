// Student Name: Zach Scroggins
// Course: 2317 - Java Programming
// Date: 01/27/2020

package zachscrogginscalculator;

import java.util.Scanner;

public class ZachScrogginsCalculator {
    private double numberOne;
    private double numberTwo;

    public ZachScrogginsCalculator() {
        numberOne = 0.0;
        numberTwo = 0.0;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void addition() {
        System.out.println(
                "\nSum : " + numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
    }

    public void subtraction() {
        System.out.println(
                "\nDifference : " + numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
    }

    public void multiplication() {
        System.out.println(
                "\nProduct : " + numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo));
    }

    public void division() {
        System.out.println(
                "\nQuotient : " + numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));
    }

    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number : ");
        firstNumber = keyboard.nextDouble();

        System.out.print("\nSecond number : ");
        secondNumber = keyboard.nextDouble();

        ZachScrogginsCalculator myJavaCalculator = new ZachScrogginsCalculator(); // creates the calculator object myJavaCalculator
        myJavaCalculator.setNumberOne(firstNumber); // passes firstNumber value to set attribute numberOne
        myJavaCalculator.setNumberTwo(secondNumber); // passes secondNumber value to set attribute numberTwo

        myJavaCalculator.addition();
        myJavaCalculator.subtraction();
        myJavaCalculator.multiplication();
        myJavaCalculator.division();
        System.out.println ("\nGoodbye");

    }
}
