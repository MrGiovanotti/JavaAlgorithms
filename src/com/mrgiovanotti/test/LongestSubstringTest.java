package com.mrgiovanotti.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mrgiovanotti.strings.LongestSubstring;

class LongestSubstringTest {

    @Test
    void test1() {
	String input = "abcabcbb";
	int expected = 3;
	assertEquals(expected, LongestSubstring.solution(input));
    }

    @Test
    void test2() {
	String input = "bbbbb";
	int expected = 1;
	assertEquals(expected, LongestSubstring.solution(input));
    }

    @Test
    void test3() {
	String input = "pwwkew";
	int expected = 3;
	assertEquals(expected, LongestSubstring.solution(input));
    }

    @Test
    void test4() {
	String input = "";
	int expected = 0;
	assertEquals(expected, LongestSubstring.solution(input));
    }

    @Test
    void test5() {
	String input = "abcdef";
	int expected = 6;
	assertEquals(expected, LongestSubstring.solution(input));
    }

    @Test
    void test6() {
	String input = "aababcabcdabcdeabcdef";
	int expected = 6;
	assertEquals(expected, LongestSubstring.solution(input));
    }

    @Test
    void test7() {
	String input = "abcdeffff";
	int expected = 6;
	assertEquals(expected, LongestSubstring.solution(input));
    }

    @Test
    void test8() {
	String input = "dvdf";
	int expected = 3;
	assertEquals(expected, LongestSubstring.solution(input));
    }

    @Test
    void test9() {
	String input = "aaabcabdb";
	int expected = 4;
	assertEquals(expected, LongestSubstring.solution(input));
    }

    @Test
    void test10() {
	String input = "abcdabcf";
	int expected = 5;
	assertEquals(expected, LongestSubstring.solution(input));
    }

    @Test
    void test11() {
	String input = "abcdabcdabceabcd";
	int expected = 5;
	assertEquals(expected, LongestSubstring.solution(input));
    }

    @Test
    void test12() {
	String input = "laamigadelesteban";
	int expected = 7;
	assertEquals(expected, LongestSubstring.solution(input));
    }

    @Test
    void test1Solution2() {
	String input = "abcabcbb";
	int expected = 3;
	assertEquals(expected, LongestSubstring.solution2(input));
    }

    @Test
    void test2Solution2() {
	String input = "bbbbb";
	int expected = 1;
	assertEquals(expected, LongestSubstring.solution2(input));
    }

    @Test
    void test3Solution2() {
	String input = "pwwkew";
	int expected = 3;
	assertEquals(expected, LongestSubstring.solution2(input));
    }

    @Test
    void test4Solution2() {
	String input = "";
	int expected = 0;
	assertEquals(expected, LongestSubstring.solution2(input));
    }

    @Test
    void test5Solution2() {
	String input = "abcdef";
	int expected = 6;
	assertEquals(expected, LongestSubstring.solution2(input));
    }

    @Test
    void test6Solution2() {
	String input = "aababcabcdabcdeabcdef";
	int expected = 6;
	assertEquals(expected, LongestSubstring.solution2(input));
    }

    @Test
    void test7Solution2() {
	String input = "abcdeffff";
	int expected = 6;
	assertEquals(expected, LongestSubstring.solution2(input));
    }

    @Test
    void test8Solution2() {
	String input = "dvdf";
	int expected = 3;
	assertEquals(expected, LongestSubstring.solution2(input));
    }

    @Test
    void test9Solution2() {
	String input = "aaabcabdb";
	int expected = 4;
	assertEquals(expected, LongestSubstring.solution2(input));
    }

    @Test
    void test10Solution2() {
	String input = "abcdabcf";
	int expected = 5;
	assertEquals(expected, LongestSubstring.solution2(input));
    }

    @Test
    void test11Solution2() {
	String input = "abcdabcdabceabcd";
	int expected = 5;
	assertEquals(expected, LongestSubstring.solution2(input));
    }

    @Test
    void test12Solution2() {
	String input = "laamigadelesteban";
	int expected = 7;
	assertEquals(expected, LongestSubstring.solution2(input));
    }

}
