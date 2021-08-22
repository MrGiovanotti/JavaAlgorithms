package com.mrgiovanotti.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string input, find the length of the longest substring without
 * repeating characters.
 *
 * @author mrgiovanotti
 *
 */

public class LongestSubstring {

    private LongestSubstring() {

    }

    public static int solution(String input) {

	Set<Character> notRepeatedChars = new HashSet<>();
	int maxSubstringNotRepeatingCharsLength = 0;

	for (int i = 0; i < input.length(); i++) {
	    notRepeatedChars.add(input.charAt(i));

	    for (int j = i + 1; j < input.length(); j++) {
		if (!notRepeatedChars.contains(input.charAt(j))) {
		    notRepeatedChars.add(input.charAt(j));
		} else {
		    maxSubstringNotRepeatingCharsLength = Math.max(maxSubstringNotRepeatingCharsLength,
			    notRepeatedChars.size());
		    notRepeatedChars.clear();
		    break;
		}
	    }
	    if (!notRepeatedChars.isEmpty()) {
		maxSubstringNotRepeatingCharsLength = Math.max(maxSubstringNotRepeatingCharsLength,
			notRepeatedChars.size());
		break;
	    }
	}

	return maxSubstringNotRepeatingCharsLength;
    }

    public static int solution2(String input) {
	int firstPointer = 0;
	int secondPointer = 0;
	int maxLength = 0;
	Set<Character> notRepeatedChars = new HashSet<>();

	while (secondPointer < input.length()) {
	    if (!notRepeatedChars.contains(input.charAt(secondPointer))) {
		notRepeatedChars.add(input.charAt(secondPointer));
		maxLength = Math.max(maxLength, notRepeatedChars.size());
		secondPointer++;
	    } else {
		notRepeatedChars.remove(input.charAt(firstPointer));
		firstPointer++;
	    }
	}
	return maxLength;
    }

}
