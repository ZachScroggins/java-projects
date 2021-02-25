// Student Name: Zach Scroggins
// Course: 2317 - Java Programming
// Date: 04/10/2020

package zachscrogginstriangles;

import java.util.Scanner;

public class ZachScrogginsTriangles {
    private double area;
    private double permimeter;

    // CREATE A DEFAULT CONSTRUCTOR TO INITIALIZE area and permimeter
    public ZachScrogginsTriangles() {
        area = 0.0;
        permimeter = 0.0;
    }

    // CREATE THE TWO SETTER METHODS FOR area and permimeter
    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double permimeter) {
        this.permimeter = permimeter;
    }

    // CREATE THE TWO GETTER METHODS FOR area and permimeter
    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
        return this.permimeter;
    }

    public void triangleType(double side1, double side2, double side3) {
        if (side1 == side2 && side1 == side3) {
            System.out.println(
                    "The triangle is Equilateral since it has equal length on all three sides.");
            System.out.println("All Equilateral triangle are equiangular triangles.");

        } else {
            if (side1 == side2 && side1 != side3 || side1 != side2 && side2 == side3
                    || side1 == side3 && side1 != side2) {
                System.out
                        .println("The triangle is Isosceles since it has two equal length sides.");
                System.out.println("Isosceles triangle also has two equal angles");

            } else {
                if (side1 != side2 && side1 != side3) {
                    System.out.println("The triangle is Scalene with all no equal side.");
                    System.out.println("Scalene triangles have no equal angles.");

                }
            }
        }
    }

    // WRITE THE AREA METHOD WITH TWO DOUBLE PARAMETERS WITH A VOID RETURN TYPE
    public void area(double base, double height) {
        // CALCULATE THE AREA (this.area)
        setArea((base * height) / 2);
        System.out.println("\nThe area is: " + getArea());
    }

    // WRITE THE PERMIMETER METHOD WITH THREE DOUBLE PARAMETERS WITH A VOID RETURN TYPE
    public void permimeter(double side1, double side2, double side3) {
        // CALCULATE THE PERMIMETER (this.permimeter)
        setPerimeter(side1 + side2 + side3);
        System.out.println("The perimeter is: " + getPerimeter());
    }

    public static void main(String[] args) {
        System.out.println("\nWelcome to the Triangles program");
        Scanner key = new Scanner(System.in);
        int x = 1;
        String y = "y";

        // CREATE A TRIANGLES OBJECT CALLED triangleObj
        ZachScrogginsTriangles triangleObj = new ZachScrogginsTriangles();

        do {
            try {
                while ("y".equalsIgnoreCase(y)) {
                    x = 1;
                    System.out.print("\nEnter length 1: ");
                    double side1 = key.nextDouble();

                    System.out.print("Enter length 2: ");
                    double side2 = key.nextDouble();

                    System.out.print("Enter length 3: ");
                    double side3 = key.nextDouble();

                    System.out.println(" ");

                    System.out.print("Enter the Base: ");
                    double base = key.nextDouble();

                    System.out.print("Enter the Height: ");
                    double height = key.nextDouble();

                    System.out.println(" ");
                    System.out.println("---------------------");
                    System.out.println(" ");
                    triangleObj.triangleType(side1, side2, side3);
                    triangleObj.area(base, height);
                    triangleObj.permimeter(side1, side2, side3);
                    x = 2;

                    System.out.print("\nContinue? Y/N: ");
                    y = key.nextLine();
                    y = key.nextLine();
                }
                // CREATE THE CATCH CLAUSE WITH Exception e
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                key.next();
            }
        } while (x == 1);

        key.close();
        System.out.println("\nGoodbye!");
        System.exit(0);
    }
}
