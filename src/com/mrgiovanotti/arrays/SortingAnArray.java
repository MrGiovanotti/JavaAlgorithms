package com.mrgiovanotti.arrays;

import com.mrgiovanotti.utils.Utils;

public class SortingAnArray {

  public static void main(String[] args) {

    int[] myUnsortedArray = {4, 10, 5, 3, 1, 8, 2, 9, 6, 7};

    sort(myUnsortedArray);

  }

  private static void sort(int[] myUnsortedArray) {
    int finalIndex = myUnsortedArray.length - 1;
    int temporalInt;
    while (finalIndex != 0) {
      for (int i = 0; i < finalIndex; i++) {
        if (myUnsortedArray[i] > myUnsortedArray[i + 1]) {
          temporalInt = myUnsortedArray[i];
          myUnsortedArray[i] = myUnsortedArray[i + 1];
          myUnsortedArray[i + 1] = temporalInt;
        }
      }
      finalIndex--;
    }

    Utils.printArray(myUnsortedArray);

  }

}
