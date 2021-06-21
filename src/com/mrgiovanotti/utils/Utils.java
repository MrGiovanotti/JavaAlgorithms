package com.mrgiovanotti.utils;

public class Utils {

  private Utils() {

  }

  public static void printArray(int[] array) {
    String stringStart = "{";
    String stringEnd = "}";
    StringBuilder concatNumbersAsString = new StringBuilder(stringStart);
    for (int i = 0; i < array.length; i++) {
      concatNumbersAsString.append(array[i]);
      if (i != array.length - 1) {
        concatNumbersAsString.append(",");
      }
    }
    concatNumbersAsString.append(stringEnd);
    System.out.println(concatNumbersAsString);
  }

  public static int[] sortArray(int[] array) {
    int finalIndex = array.length - 1;
    int temporalInt;
    while (finalIndex != 0) {
      for (int i = 0; i < finalIndex; i++) {
        if (array[i] > array[i + 1]) {
          temporalInt = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temporalInt;
        }
      }
      finalIndex--;
    }
    return array;
  }

  public static boolean areArraysEqual(int[] firstArray, int[] secondArray) {
    if (firstArray.length != secondArray.length) {
      return false;
    }
    for (int i = 0; i < firstArray.length; i++) {
      if (firstArray[i] != secondArray[i]) {
        return false;
      }
    }
    return true;
  }

}
