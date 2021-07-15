package com.mrgiovanotti.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import com.mrgiovanotti.strings.OneAway;

class OneAwayTest {

  @Test
  void compareIdenticalStringsShouldBeTrue() {
    String text1 = "pale";
    String text2 = "pale";
    assertTrue(OneAway.solution1(text1, text2));
  }

  @Test
  void comparePaleAndPlShouldBeFalse() {
    String text1 = "pale";
    String text2 = "pl";
    assertFalse(OneAway.solution1(text1, text2));
  }

  @Test
  void comparePaleAndPleShouldBeTrue() {
    String text1 = "pale";
    String text2 = "ple";
    assertTrue(OneAway.solution1(text1, text2));
  }

  @Test
  void comparePalesAndPaleShouldBeTrue() {
    String text1 = "pales";
    String text2 = "pale";
    assertTrue(OneAway.solution1(text1, text2));
  }

  @Test
  void comparePaleAndBaleShouldBeTrue() {
    String text1 = "pale";
    String text2 = "bale";
    assertTrue(OneAway.solution1(text1, text2));
  }

  @Test
  void comparePaleAndBakeShouldBeFalse() {
    String text1 = "pale";
    String text2 = "bake";
    assertFalse(OneAway.solution1(text1, text2));
  }

  @Test
  void comparePaleAndLepaShouldBeFalse() {
    String text1 = "pale";
    String text2 = "lepa";
    assertFalse(OneAway.solution1(text1, text2));
  }

  @Test
  void comparePaAndPaleShouldBeFalse() {
    String text1 = "pa";
    String text2 = "pale";
    assertFalse(OneAway.solution1(text1, text2));
  }

}
