package com.mrgiovanotti.utils;

public class Experimentation {

  public static void main(String[] args) {
    String a = "pale";
    String b = "pase";
    for (int i = 0; i < a.length(); i++) {
      if (a.contains(String.valueOf(b.charAt(i)))) {
        System.out.println("Contiene: " + b.charAt(i));
      } else {
        System.out.println("No contiene: " + b.charAt(i));
      }
    }
  }

}
