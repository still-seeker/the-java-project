import java.math.*;
import java.util.*;

/**
 * This program computes the odds of winning a grand prize in a lottery
 */

public class LotteryOdds {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("How many numbers do you need to draw? ");
            int k = in.nextInt();

            System.out.print("What is the highest number you can draw? ");
            int n = in.nextInt();

            /**
             * compute the binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
             */
            BigInteger lotteryOdds = BigInteger.valueOf(1);
            for (int i = 1; i <= k; i++) {
                lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(
                    BigInteger.valueOf(i)
                );
            }
            System.out.println("Your odds are 1 in " + lotteryOdds + ". \nGOOD LUCK!!");
        }
    }
}
