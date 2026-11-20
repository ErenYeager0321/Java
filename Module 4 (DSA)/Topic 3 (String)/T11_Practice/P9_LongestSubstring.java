package T11_Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P9_LongestSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO: Ask user for input string
		// TODO: Find length of longest substring without repeating characters
		// TODO: Print the length
		String s = sc.nextLine().toLowerCase();
		Set<Character> set = new HashSet<>();
		int left = 0, maxLen = 0;

		for (int right = 0; right < s.length(); right++) {
			while (set.contains(s.charAt(right))) {
				// remove leftmost char until duplicate is gone
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			maxLen = Math.max(maxLen, right - left + 1);
		}

		System.out.println("The length of the longest substring without repeating characters is: " + maxLen);
		sc.close();
/*
public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            for (int j = i; j < s.length(); j++) {
                if (temp.contains("" + s.charAt(j))) {
                    break;
                }
                temp = temp + s.charAt(j);
                if (temp.length() > max) {
                    max = temp.length();
                }
            }
        }
        System.out.println("Longest Substring Length: " + max);
    }
}
		 */
		}
}
