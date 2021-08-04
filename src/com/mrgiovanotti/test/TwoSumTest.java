package com.mrgiovanotti.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;
import com.mrgiovanotti.strings.TwoSum;

class TwoSumTest {

  @Test
  void test1() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] expected = {0, 1};
    assertArrayEquals(expected, TwoSum.twoSum(nums, target));
  }

  @Test
  void test2() {
    int[] nums = {3, 2, 4};
    int target = 6;
    int[] expected = {1, 2};
    assertArrayEquals(expected, TwoSum.twoSum(nums, target));
  }

  @Test
  void test3() {
    int[] nums = {3, 3};
    int target = 6;
    int[] expected = {0, 1};
    assertArrayEquals(expected, TwoSum.twoSum(nums, target));
  }

  @Test
  void test4() {
    int[] nums = {7, 15, -10, 3, 8, 8, 4};
    int target = -6;
    int[] expected = {2, 6};
    assertArrayEquals(expected, TwoSum.twoSum(nums, target));
  }

}
