
import java.util.*;
import java.io.*;


public class Main {

  public static void main (String[] args) {
    // Arguments will be read by STDIN
    Scanner s = new Scanner(System.in); // do not change this
    String inputLine = s.nextLine(); // do not change this

    Map<Character, Integer> charCounts = new HashMap<>();

    // Count the occurrences of each character
    for (char c : inputLine.toCharArray()) {
      charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
    }

    // Find the first character with count 1
    for (char c : inputLine.toCharArray()) {
      if (charCounts.get(c) == 1) {
        System.out.println(c);
        return;
      }
    }

    // Default return statement, assuming there will always be a non-repeating character
    System.out.println('\0');
  }
}
