package com.mrgiovanotti.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.mrgiovanotti.strings.StringCompression;

class StringCompressionTest {

  @Test
  void test1() {
    String text = "abc";
    assertEquals("abc", StringCompression.compress(text));
  }

  @Test
  void test2() {
    String text = "a";
    assertEquals("a", StringCompression.compress(text));
  }

  @Test
  void test3() {
    String text = "ab";
    assertEquals("ab", StringCompression.compress(text));
  }

  @Test
  void test4() {
    String text = "aa";
    assertEquals("aa", StringCompression.compress(text));
  }

  @Test
  void test5() {
    String text = "aabb";
    assertEquals("aabb", StringCompression.compress(text));
  }

  @Test
  void test6() {
    String text = "aabcca";
    assertEquals("aabcca", StringCompression.compress(text));
  }

  @Test
  void test7() {
    String text = "aabcccccaaa";
    assertEquals("a2b1c5a3", StringCompression.compress(text));
  }

  @Test
  void test8() {
    String text = "aaaaaaAA";
    assertEquals("a6A2", StringCompression.compress(text));
  }

  @Test
  void test9() {
    String text = "aaaaaaaaa";
    assertEquals("a9", StringCompression.compress(text));
  }

  @Test
  void test10() {
    String text = "elEstebanTieneUnaAmigaQueSeLlamaEsther";
    assertEquals("elEstebanTieneUnaAmigaQueSeLlamaEsther", StringCompression.compress(text));
  }

}
