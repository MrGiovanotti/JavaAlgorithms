package com.mrgiovanotti.strings;

/**
 * 
 * @author mrgiovanotti
 * @description Write a method to replace all spaces in a string with '%20'.
 */

public class URLify {

  public static void main(String[] args) {
    String url = "Mr John Smith ";
    System.out.println(solution(url));
  }

  private static String solution(String url) {
    url = url.trim();
    return url.replace(" ", "%20");
  }

}
