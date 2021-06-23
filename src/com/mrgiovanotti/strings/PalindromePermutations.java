package com.mrgiovanotti.strings;

import java.util.Map;
import com.mrgiovanotti.utils.Utils;

/**
 * 
 * @author mrgiovanotti
 * @description Given a string, write a function to check if it is a permutation of a palin­drome.
 */
public class PalindromePermutations {

  public static void main(String[] args) {
    System.out.println(solution1("bbccaf"));
  }

  /**
   * En un palíndromo los caracteres se van repitiendo en números pares de veces. Sólo una vez se
   * puede repetir un caracter un número impar de veces.
   * 
   */
  private static boolean solution1(String text) {
    if (text.length() == 1) {
      return true;
    }
    Map<Character, Integer> charactersMap = Utils.countChars(text);
    int numberOfOdd = 0;
    for (Integer v : charactersMap.values()) {
      if (v % 2 != 0) {
        numberOfOdd++;
        if (numberOfOdd > 1) {
          return false;
        }
      }
    }
    return true;
  }

}
