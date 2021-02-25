// Student Name: Zach Scroggins
// Course: 2317 - Java Programming
// Date: 03/13/2020

package zachscrogginsnumberarraytwo;

import java.util.Scanner;

public class ZachScrogginsNumberArrayTwo {
    // create a two diminsional array attribute called wholeNumbers to store intergers
    private int[][] wholeNumbers;

    // create an overloaded constructor with a parameter to accept a two diminsiional array and
    // initialize the attribute this.wholeNumbers
    public ZachScrogginsNumberArrayTwo(int[][] wholeNumbers) {
        this.wholeNumbers = wholeNumbers;
    }

    public ZachScrogginsNumberArrayTwo(int rows, int columns) {
        this.wholeNumbers = new int[rows][columns];
        int initzValue = 0;
        for (int x = 0; x < this.wholeNumbers.length; x++)
            for (int y = 0; y < this.wholeNumbers[x].length; y++)
                this.wholeNumbers[x][y] = initzValue += 50;
    }

    // create a setter for the attribute
    public void setWholeNumbers(int[][] matrix) {
        wholeNumbers = matrix;
    }

    // create a getter for the attribute
    public int[][] getWholeNumbers() {
        return wholeNumbers;
    }

    public void showNumbers() {
        int total = 0;
        System.out.println("\nPrinting Two Diminsional Array Values");
        for (int x = 0; x < wholeNumbers.length; ++x) {
            for (int y = 0; y < wholeNumbers[x].length; ++y) {
                System.out.println("Array Value [" + x + "][" + y + "] = " + wholeNumbers[x][y]);
                total += wholeNumbers[x][y];
            }
        }
        System.out.println("Sum is " + total);
        System.out.println("Average is " + (total / wholeNumbers.length));
    }

    // create an overloaded method called showNumbers with a int two diminsional array parameter
    // called arrayofNumbers
    public void showNumbers(int[][] arrayOfNumbers) {
        int tot = 0;
        System.out.println("\nPrinting Two Diminsional Array Values");
        for (int x = 0; x < arrayOfNumbers.length; ++x) {
            for (int y = 0; y < wholeNumbers[x].length; ++y) {
                System.out.println("Array Value [" + x + "][" + y + "] = " + arrayOfNumbers[x][y]);
                tot += arrayOfNumbers[x][y];
            }
        }
        System.out.println("Sum is " + tot);
        System.out.println("Average is " + (tot / arrayOfNumbers.length));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows, columns;
        rows = columns = 0;

        System.out.print("\nHow many rows in your array ?:");
        rows = input.nextInt();

        System.out.print("\nHow many columns in your array ?:");
        columns = input.nextInt();


        ZachScrogginsNumberArrayTwo inputNumbers = new ZachScrogginsNumberArrayTwo(rows, columns);

        inputNumbers.showNumbers(inputNumbers.getWholeNumbers());

        int[][] someNums = {{2, 4, 6, 8, 10}, {5, 10, 15, 20, 25}};
        ZachScrogginsNumberArrayTwo defaultNumbers = new ZachScrogginsNumberArrayTwo(someNums);
        defaultNumbers.showNumbers();
        input.close();
    }
}
