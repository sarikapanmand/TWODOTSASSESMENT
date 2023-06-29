
import java.util.*;
class StarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // do not change this
    String inputLine = s.nextLine(); // do not change this

    int numRows = Integer.parseInt(inputLine);

    for (int i = 1; i <= numRows; i++) {
      // Print spaces
      for (int j = 1; j <= numRows - i; j++) {
        System.out.print(" ");
      }

      // Print asterisks
      for (int k = 1; k <= (2 * i) - 1; k++) {
        System.out.print("*");
      }

      System.out.println(); // Move to the next line
    }
  }
}