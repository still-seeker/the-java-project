import java.util.*;

public class Scanning {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("What is your name? ");
            String name = input.nextLine();
            
            
            System.out.print("What is your favorite pet? ");
            String pet = input.nextLine();
            
            
            System.out.println();
            System.out.println("Hello " + name + "!" +
                    " your favorite pet is " + pet + ".");
        }
    }
}
