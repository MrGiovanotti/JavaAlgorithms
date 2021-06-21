package com.mrgiovanotti.utils;

import java.util.Arrays;

public class Experimentation {

  public static void main(String[] args) {
    int[] array = new int[10];
    Utils.printArray(array);
    Arrays.fill(array, 5);
    System.out.println(Arrays.toString(array));
  }

}
