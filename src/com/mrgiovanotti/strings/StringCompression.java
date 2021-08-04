package com.mrgiovanotti.strings;

/**
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not
 * become smaller than the original string, your method should return the original string. You can
 * assume the string has only uppercase and lowercase letters (a-z)
 * 
 * @author mrgiovanotti
 *
 */
public class StringCompression {

  public static void main(String[] args) {
    // No necesitamos código aquí, las pruebas están hechas en JUNIT
  }

  public static String compress(String text) {
    String auxiliarText = text + "_";
    int textLength = auxiliarText.length();
    int counter = 1;
    StringBuilder compressedText = new StringBuilder();
    for (int i = 0; i < textLength - 1; i++) {
      if (auxiliarText.charAt(i) == auxiliarText.charAt(i + 1)) {
        counter++;
      } else {
        compressedText.append(String.valueOf(auxiliarText.charAt(i)) + counter);
        counter = 1;
      }
    }
    if (text.length() <= compressedText.toString().length()) {
      return text;
    }
    return compressedText.toString();
  }

}
