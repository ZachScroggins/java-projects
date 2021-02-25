// Student Name: Zach Scroggins
// Course: 2317 - Java Programming
// Date: 02/29/2020

package zachscrogginsloan;

import java.text.NumberFormat;
import java.util.Scanner;

public class ZachScrogginsLoan {
    // create the private double attributes : loanAmt, interestRate, interestAmount, totalAmt
    private double loanAmt, interestRate, interestAmount, totalAmt;

    // create a default construction to initialize all of the attributes
    public ZachScrogginsLoan() {
        loanAmt = 0.0;
        interestRate = 0.0;
        interestAmount = 0.0;
        totalAmt = 0.0;
    }

    // create a setter for each attribute
    public void setLoanAmt(double loanAmt) {
        this.loanAmt = loanAmt;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount += interestAmount;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt += totalAmt;
    }

    // create a getter for each attribute
    public double getLoanAmt() {
        return loanAmt;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    // complete the calculateLoan method
    public void calculateLoan() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

        System.out.println("\nLoan amount: " + currencyFormatter.format(this.loanAmt));
        System.out.println("Interest rate: " + (this.interestRate * 100) + "%");
        System.out.println(
                "Interest: " + currencyFormatter.format((this.loanAmt * this.interestRate)));

        // calculate the cumlative interestAmount
        setInterestAmount(this.loanAmt * this.interestRate);

        // compute the cumlative loanAmt
        setTotalAmt(this.loanAmt);
    }

    public static void main(String[] args) {
        String flag = "";
        int counter = 0;
        double loanvalue = 0.0;
        double interest = 0.0;
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println("\nWelcome to the Interest Calculator");
        // create a Loan called obj
        ZachScrogginsLoan obj = new ZachScrogginsLoan();

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("\nEnter loan amount: ");
            loanvalue = keyboard.nextDouble();
            System.out.print("Enter interest rate: ");
            interest = keyboard.nextDouble();

            // use the setter to set the loanAmt with the loanvalue for the Loan obj
            obj.setLoanAmt(loanvalue);

            // use the setter to set the interestRate with the interest for the Loan obj
            obj.setInterestRate(interest);

            // call the calculateLoan method for the Loan obj
            obj.calculateLoan();

            System.out.print("\nWould you like to enter another loan amount? (y/n):");
            Scanner input = new Scanner(System.in);
            flag = input.nextLine();

            if (++counter >= 3)
                flag = "n";
        } while (flag.equalsIgnoreCase("Y"));
        System.out.println("\nTotal loan: " + currencyFormatter.format(obj.getTotalAmt()));
        System.out.println("Total interest: " + currencyFormatter.format(obj.getInterestAmount()));
        System.out.println("\nThank you.");
    }
}
