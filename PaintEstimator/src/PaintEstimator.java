import java.util.Scanner;

public class PaintEstimator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double wallHeight;
      double wallWidth;
      double wallArea;
      
      System.out.println("Enter wall height (feet):");
      wallHeight = scnr.nextDouble();
      System.out.println("Enter wall width (feet):");
      wallWidth = scnr.nextDouble();
      
      // Calculate and output wall area
      wallArea = wallHeight * wallWidth;
      System.out.println("Wall area: " + wallArea + " square feet");
      double paint = wallArea / 350;
      int cans = (int)paint + 1;
      System.out.println("Paint needed: " + paint + " gallons");
      System.out.println("Cans needed: " + cans + " can(s)");
   }
}