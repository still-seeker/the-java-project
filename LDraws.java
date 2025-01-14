import java.util.*;

/**
 * This program demonstrates array manipulation.
 */

public class LDraws {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you need draw? ");
        int k = input.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = input.nextInt();

        //fill the array with numbers 1 2 3 4 ...n
        int[] numbers = new int[n];
        for (int i = 0; i <  numbers.length; i++) {
            numbers[i] = i + 1;
        }

        //draw k numbers and put them into a second array
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            //make a random index between 0 and n - 1
            int r = (int) (Math.random() * n);

            //pick the elements at the random location
            result[i] = numbers[r];

            //move the last element into the random location
            numbers[r] = numbers[n - 1];
            n--;
        }

        //print the sorted array
        Arrays.sort(result);
        System.out.println("Place the following combination, it will make you a fortune");
        for (int r : result)
        System.out.println(r);
    }

}
