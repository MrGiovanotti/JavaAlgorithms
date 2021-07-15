package com.mrgiovanotti.strings;

/**
 * 
 * One Away: There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they
 * are one edit (or zero edits) away. EXAMPLE pale, ple -> true pales, pale -> true pale, bale ->
 * true pale, bake -> false
 * 
 *
 */

public class OneAway {

  public static void main(String[] args) {
    // No necesitamos código aquí, las pruebas están hechas con JUnit
  }


  /**
   * Sólo es necesario hacer la comprobación si los string son del mismo tamaño, o si hay un
   * caracter de diferencia en su tamaño
   * 
   * @param text1
   * @param text2
   * @return true si hay un solo edit, false si hay más
   */
  public static boolean solution1(String text1, String text2) {

    if (text1.length() == text2.length()) {
      return checkOneReplaceEdit(text1, text2);
    }

    if (text1.length() == text2.length() + 1) {
      return checkOneInsertEdit(text1, text2);
    }

    if (text1.length() == text2.length() - 1) {
      return checkOneInsertEdit(text2, text1);
    }
    return false;
  }

  /**
   * Si hay un solo reemplazo, los string deberían ser iguales, excepto en un caracter
   * 
   * @param firstString
   * @param secondString
   * @return true si hay un solo reemplazo, false si hay más de uno
   */
  private static boolean checkOneReplaceEdit(String firstString, String secondString) {
    boolean oneDifferenceDetected = false;
    for (int i = 0; i < firstString.length(); i++) {
      if (firstString.charAt(i) != secondString.charAt(i)) {
        if (oneDifferenceDetected) {
          return false;
        }
        oneDifferenceDetected = true;
      }
    }
    return true;
  }

  private static boolean checkOneInsertEdit(String largeString, String shortString) {
    int largeStringIndex = 0;
    int shortStringIndex = 0;
    while (largeStringIndex < largeString.length() && shortStringIndex < shortString.length()) {
      if (largeString.charAt(largeStringIndex) == shortString.charAt(shortStringIndex)) {
        largeStringIndex++;
        shortStringIndex++;
      } else {
        if (largeStringIndex != shortStringIndex) {
          return false;
        }
        largeStringIndex++;
      }
    }
    return true;
  }

}
