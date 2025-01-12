public class VariablesAndConstants {
    public static void main(String[] args) {
        //variable declaration and initialization
        final double CM_PER_INCH = 2.54; // constant
        double paperWidth = 8;
        double paperHeight = 10;
        System.out.println("Size of paper in centimeters: " 
            + paperHeight * CM_PER_INCH + " by " + paperWidth * CM_PER_INCH);
    }
}
