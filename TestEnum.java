import java.util.*;

/**
 * This program demonstrates enumarated types.
 */

public class TestEnum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("ENTER SIZE: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
            String userInput = input.next().toUpperCase();
            Size size = Enum.valueOf(Size.class, userInput);
            System.out.println("abbreviation=" + size.getAbbreviation());
            if (size == Size.EXTRA_LARGE)
                System.out.println("Checking availability status briefly \nPlease Hold on a Moment!!");
        }
    }
}

enum Size{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    
    private Size(String abbreviation) {this.abbreviation = abbreviation;}
    public String getAbbreviation() {return abbreviation ;}

    private final String abbreviation;
}
