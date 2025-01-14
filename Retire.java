import java.util.*;

/**
 * This program demonstrates  a <code>while</code> loop
 */

public class Retire {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("What is your name? ");
            String name = input.nextLine();

            System.out.print("How much money do you need to retire? ");
            double goal = input.nextDouble();

            System.out.print("How much money will you contribute every year? ");
            double amount = input.nextDouble();

            System.out.print("And what is the interest rate in %: ");
            double interestRate = input.nextDouble();

            double balance = 0;
            int years = 0;

            while (balance < goal) {
                //add this year's payment
                balance += amount;
                double interest = balance * interestRate/100;
                balance += interest;
                years ++;
            }

            System.out.println("Hi " + name + ", you can retire in " + years + 
            "years");
        }
    }
}
