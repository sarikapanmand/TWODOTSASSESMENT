
import java.util.*;
import java.io.*;


Public class Search_Alphabets {

  public static void main (String[] args) {
    // Arguments will be read by STDIN
    Scanner s = new Scanner(System.in); // do not change this
    String inputLine = s.nextLine(); // do not change this
    boolean[] hasLetter = new boolean[26]; // 26 letters in the English alphabet

    // Iterate through the string and mark the presence of each letter
    for (char c : inputLine.toCharArray()) {
      if (Character.isLetter(c)) {
        int index = Character.toLowerCase(c) - 'a';
        hasLetter[index] = true;
      }
    }

    // Check if all elements in the array are true
    for (boolean letter : hasLetter) {
      if (!letter) {
        System.out.println("false");
        return;
      }
    }

    System.out.println("true");
  }
}

