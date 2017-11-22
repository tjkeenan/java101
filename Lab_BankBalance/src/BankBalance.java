package textbook.examples;

import java.util.Scanner;

public class BankBalance {

    public static void main(String[] args) {
        double balance;
        int response = 0;
        int year = 1;
        final double INT_RATE = 0.03;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        balance = keyboard.nextDouble();
        /// while (response == 1) {
        do {

            System.out.println("Do you want to see next year's balance?");
            System.out.print("Enter 1 for yes");
            System.out.print("   or any other number for no >> ");
            response = keyboard.nextInt();

            if (response == 1) {
                balance = balance + balance * INT_RATE;
                System.out.println("After year " + year + " at " + INT_RATE
                        + " interest rate, balance is $" + balance);
                year = year + 1;
            }

        } while (response == 1);
        //}
    }
}
