package com.mrgiovanotti.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author mrgiovanotti
 * 
 * @description Implement an algorithm to determine if a string has all unique characters.
 *
 */

public class IsUnique {

  public static void main(String[] args) {
    String stringTest1 = "abcdefghijklmnopqr";
    if (allCharactersUnique(stringTest1)) {
      System.out.println("Los caracteres son únicos");
    } else {
      System.out.println("Los caracteres se repiten");
    }

    String stringTest2 = "abcdefghijklmnopqtrstuvwxyz";
    if (otherOneSolution(stringTest2)) {
      System.out.println("String 2 único");
    } else {
      System.out.println("String 2 NO único");
    }
  }

  private static boolean allCharactersUnique(String stringTest) {
    char[] letters = stringTest.toCharArray();
    for (int i = 0; i < stringTest.length(); i++) {
      for (int j = i + 1; j < stringTest.length(); j++) {
        if (letters[i] == letters[j]) {
          return false;
        }
      }
    }
    return true;
  }

  private static boolean otherOneSolution(String stringTest) {
    char[] letters = stringTest.toCharArray();
    Set<Character> processedLetters = new HashSet<>();
    for (char letter : letters) {
      if (processedLetters.contains(letter)) {
        return false;
      } else {
        processedLetters.add(letter);
      }
    }
    return true;
  }

}
