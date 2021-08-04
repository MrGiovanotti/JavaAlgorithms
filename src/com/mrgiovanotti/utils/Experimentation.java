package com.mrgiovanotti.utils;

public class Experimentation {

  public static void main(String[] args) {
    String entrada = "aaaaaaaab";
    System.out.println(countCompression(entrada));
  }

  static int countCompression(String str) {
    int compressedlength = 0;
    int countConsecutive = 0;
    for (int i = 0; i < str.length(); i++) {
      countConsecutive++;
      /* If next character is different than current, increase the length. */
      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        compressedlength += 1 + String.valueOf(countConsecutive).length();
        countConsecutive = 0;
      }
    }
    return compressedlength;
  }

}
