// Student Name: Zach Scroggins
// Course: 2317 - Java Programming
// Date: 02/29/2020

package zachscrogginscalculate;

import java.util.Scanner;

public class ZachScrogginsCalculate {
    double area, rectLength, rectWidth;

    // CREATE SETTERS FOR area, rectLength, rectWidth
    public void setArea(double area) {
        this.area = area;
    }

    public void setRectLength(double length) {
        rectLength = length;
    }

    public void setRectWidth(double width) {
        rectWidth = width;
    }

    // CREATE GETTERS FOR area, rectLength, rectWidth
    public double getArea() {
        return area;
    }

    public double getRectLength() {
        return rectLength;
    }

    public double getRectWidth() {
        return rectWidth;
    }

    // circleArea: Calculate the area of the circle.
    public double circleArea(double radius) {
        return (3.142 * radius * radius);
    }

    // rectArea: Calculate the area of a rectangle or square.
    public double rectArea(double length, double width) {
        return (length * width);
    }

    // WRITE A COMMENT FOR EACH LINE IN THE MAIN METHOD TO EXPLAIN WHAT IT IS ACCOMPLISHING
    public static void main(String[] args) {
        // instantiate new ZachScrogginsCalculate object named calc
        ZachScrogginsCalculate calc = new ZachScrogginsCalculate();
        // Output welcome message to screen
        System.out.println("Welcome to the area calculator.");
        // Start do...while loop
        do {
            /*
             * Call calc object's eitherOr method to evaluate/validate user input choice. If they
             * choose 1, calc circle area. If they choose 2, calc rect area. If invalid input,
             * display error message & restart loop
             */
            if (calc.eitherOr("\nEnter 1 for circle or 2 for rectangle: ", '1', '2')) {
                /*
                 * Call calc object's evaluateDouble method to validate double input. If invalid,
                 * display error message & restart loop. If valid, pass double input to calc
                 * object's circleArea method. Pass result of circleArea calculation to calc
                 * object's setArea method to set area.
                 */
                calc.setArea(calc.circleArea(calc.evaluateDouble("Enter the circle's radius: ")));
                // Output circle area message to screen using calc object's getArea method to get
                // area
                System.out.println("The area of the circle is: "
                        + String.format("%.2f", calc.getArea()) + "\n");
            } else {
                /*
                 * Call calc object's evaluateDouble method to validate double input for rectLength.
                 * If invalid, display error message & restart loop. If valid, pass double input to
                 * calc object's setRectLength method to set rectLength.
                 */
                calc.setRectLength(calc.evaluateDouble("Enter the length: "));
                /*
                 * Call calc object's evaluateDouble method to validate double input for rectWidth.
                 * If invalid, display error message & restart loop. If valid, pass double input to
                 * calc object's setRectWidth method to set rectWidth.
                 */
                calc.setRectWidth(calc.evaluateDouble("Enter the width: "));
                /*
                 * Use calc object's getRectLength & getRectWidth methods to get rectLength and
                 * rectWidth. Pass length and width to calc object's rectArea method to calculate
                 * rectangle area. Pass result of calculation to calc object's setArea method to set
                 * the area
                 */
                calc.setArea(calc.rectArea(calc.getRectLength(), calc.getRectWidth()));
                // Output rectangle area message to screen using calc object's getArea method to get
                // area
                System.out.println("The area of the rectangle is: "
                        + String.format("%.2f", calc.getArea()) + "\n");
            }
            // Restart do...while loop if user enters y, end loop if user enters n
        } while (calc.eitherOr("Continue (Y/N)? ", 'y', 'n'));
        // Output goodbye message to screen
        System.out.println("Thank you. Goodbye.");
    }

    // DO NOT CHANGE ANY OF THE CODE BELOW !!!
    // eitherOr: This method takes care of gathering the input for the choices presented
    // It provides input protection against incorrect data entry causing a problem in the program
    public boolean eitherOr(String prompt, char first, char second) {
        boolean outcome = true; // Final outcome
        boolean validData; // Did the user input valid data?
        String userInput; // Holds the user response to the question
        char userInputChar; // Holds the user response converted to a single char.
        Scanner getInput = new Scanner(System.in);
        // Convert both to lower case to make the comparisons easier later on
        first = Character.toLowerCase(first);
        second = Character.toLowerCase(second);
        do {
            validData = true;
            System.out.print(prompt);
            try {
                userInput = getInput.next();

                if (userInput.length() == 1) {
                    userInputChar = Character.toLowerCase(userInput.charAt(0));

                    if (userInputChar != first) {
                        if (userInputChar == second) {
                            outcome = false;
                        } else {
                            validData = false;
                        }
                    }
                } else {
                    validData = false;
                }
            } catch (Exception e) {
                validData = false;
            }

            if (!validData) {
                System.out.println("Sorry, that was an invalid choice. Please try again.\n");
            }
        } while (!validData);
        return outcome;
    }

    public double evaluateDouble(String prompt) {
        Scanner doubleInput = new Scanner(System.in);
        double doubleNum = 0;
        do {
            System.out.print(prompt);
            try {
                doubleNum = Double.parseDouble(doubleInput.next());
            } catch (Exception e) {
                // We don't have to do anything here. doubleNum is set as 0 until a valid response
                // is entered.
            }

            if (doubleNum <= 0) {
                System.out.println("Number was not a valid positive number. Please try again.");
            }
        } while (doubleNum <= 0);

        return doubleNum;
    }
}
