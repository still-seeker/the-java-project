import java.util.*;

/**
 * This program demonstrates a <code>do/while<code> loop
 */

public class Retire2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name please: ");
            String name = input.nextLine();

            System.out.print("How much money will you contribute every year? ");
            double amount = input.nextDouble();

            System.out.print("And what is the interest rate in %? ");
            double interestRate = input.nextDouble();

            double balance = 0;
            int year = 0;

            String prompt;

            //update account balance while the user is not ready
            do {
                //add this year's balance and interest
                balance += amount;
                double interest = balance * interestRate / 100;
                balance += interest;
                year ++;

                System.out.printf("After year %d, your balance is %.2f%n", year, balance);
                //ask if ready to retire
                System.out.println("Hello " + name + ", are you ready to retire?");
                System.out.print("(Y/N) ?");
                prompt = input.next();
            } while(prompt.equals("N"));
            
        }
    }
}
