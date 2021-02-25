// Student Name: Zach Scroggins
// Course: 2317 - Java Programming
// Date: 03/13/2020

package zachscrogginsnumberarray;

import java.util.Scanner;

public class ZachScrogginsNumberArray {
    // declare a single diminsion array to store integers called wholeNumbers
    private int[] wholeNumbers;

    // create an overloaded constructors with the parameter int size
    public ZachScrogginsNumberArray(int size) {
        this.wholeNumbers = new int[size];
        int initzValue = 100;
        for (int x = 0; x < this.wholeNumbers.length; x++)
            this.wholeNumbers[x] = initzValue += 100;
    }

    // create an overloaded constructor with the parameter int [] wholeNumbers
    public ZachScrogginsNumberArray(int[] wholeNumbers) {
        this.wholeNumbers = wholeNumbers;
    }

    // create a setter for the attribute wholeNumbers
    public void setWholeNumbers(int[] arrayOfInts) {
        wholeNumbers = arrayOfInts;
    }

    // create a getter for the attribute wholeNumbers
    public int[] getWholeNumbers() {
        return wholeNumbers;
    }

    // created an overloaded method called showNumbers without parameters and a void return type
    public void showNumbers() {
        int total = 0;
        System.out.println("Printing Single Diminsion Array Values");

        for (int x = 0; x < wholeNumbers.length; ++x) {
            System.out.println("Array Value [" + x + "] = " + wholeNumbers[x]);
            total += wholeNumbers[x];
        }
        System.out.println("Sum is " + total);
        System.out.println("Average is " + (total / wholeNumbers.length));
    }

    // created an overloaded method called showNumbers with a parameter of int [] arrayOfNumbers and
    // a void return type
    public void showNumbers(int[] arrayOfNumbers) {
        int tot = 0;
        System.out.println("Printing Single Diminsion Array Values");
        for (int x = 0; x < arrayOfNumbers.length; ++x) {
            System.out.println("Array Value [" + x + "] = " + arrayOfNumbers[x]);
            tot += arrayOfNumbers[x];
        }
        System.out.println("Sum is " + tot);
        System.out.println("Average is " + (tot / arrayOfNumbers.length));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat size array would you like?: ");
        ZachScrogginsNumberArray inputNumbers = new ZachScrogginsNumberArray(input.nextInt());
        inputNumbers.showNumbers(inputNumbers.getWholeNumbers());

        int[] someNums = {4, 17, 22, 8, 35};

        ZachScrogginsNumberArray defaultNumbers = new ZachScrogginsNumberArray(someNums);
        defaultNumbers.showNumbers();
        input.close();
    }
}
