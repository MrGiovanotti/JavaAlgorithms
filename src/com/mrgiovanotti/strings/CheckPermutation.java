package com.mrgiovanotti.strings;

import java.lang.System.Logger;
import java.util.HashMap;
import java.util.Map;
import com.mrgiovanotti.utils.Utils;


/**
 * 
 * @author mrgiovanotti
 * @description Given two strings, write a method to decide if one is permutation of the other
 */
public class CheckPermutation {

  static Logger log = System.getLogger("juanito");

  public static void main(String[] args) {
    String first = "abbc";
    String second = "cbba ";
    log.log(System.Logger.Level.INFO, "Respuesta1: " + solution1(first, second));
    log.log(System.Logger.Level.INFO, "Respuesta2: " + solution2(first, second));
  }

  private static boolean solution1(String firstString, String secondString) {
    if (firstString.length() != secondString.length()) {
      return false;
    }
    int[] firstArray = new int[firstString.length()];
    int[] secondArray = new int[secondString.length()];
    for (int i = 0; i < firstString.length(); i++) {
      firstArray[i] = firstString.charAt(i);
      secondArray[i] = secondString.charAt(i);
    }
    int[] firstArrayOrdered = Utils.sortArray(firstArray);
    int[] secondArrayOrdered = Utils.sortArray(secondArray);
    return Utils.areArraysEqual(firstArrayOrdered, secondArrayOrdered);
  }

  private static boolean solution2(String firstString, String secondString) {
    if (firstString.length() != secondString.length()) {
      return false;
    }

    Map<Character, Integer> charactersOfString = new HashMap<>();

    for (int i = 0; i < firstString.length(); i++) {
      Character currentChar = firstString.charAt(i);
      if (charactersOfString.containsKey(currentChar)) {
        Integer numberOfChars = charactersOfString.get(currentChar);
        charactersOfString.put(currentChar, numberOfChars + 1);
      } else {
        charactersOfString.put(currentChar, 1);
      }
    }

    for (int i = 0; i < secondString.length(); i++) {
      Character currentChar = secondString.charAt(i);
      if (charactersOfString.containsKey(secondString.charAt(i))) {
        Integer numberOfChars = charactersOfString.get(currentChar);
        if (numberOfChars == 0) {
          return false;
        }
        charactersOfString.put(currentChar, numberOfChars - 1);
      } else {
        return false;
      }
    }
    return true;
  }

}
