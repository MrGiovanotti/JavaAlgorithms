package com.mrgiovanotti.strings;

public class ReversingAphrase {

  public static void main(String[] args) {
    String phrase = "El amor es una locura que ni el cura la cura";
    reverse(phrase);
  }

  private static void reverse(String phrase) {
    String[] wordsOfPhrase = phrase.split(" ");
    StringBuilder reversedPhrase = new StringBuilder();
    for (int i = wordsOfPhrase.length - 1; i >= 0; i--) {
      reversedPhrase.append(wordsOfPhrase[i]);
      if (i != 0) {
        reversedPhrase.append(" ");
      }
    }
    System.out.println(reversedPhrase);
  }

}
