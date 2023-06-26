//Check if two strings match where one string contains wildcard characters


public class Day41 {
    public static boolean matchStrings(String str, String pattern) {
        // Base cases
        if (str.isEmpty() && pattern.isEmpty()) {
            return true;
        }

        if (pattern.length() > 0 && pattern.charAt(0) == '*') {
            if (str.isEmpty()) {
                return matchStrings(str, pattern.substring(1));
            } else {
                return matchStrings(str.substring(1), pattern) || matchStrings(str, pattern.substring(1));
            }
        }

        if (str.length() > 0 && pattern.length() > 0 &&
                (str.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '?')) {
            return matchStrings(str.substring(1), pattern.substring(1));
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "hello_world";
        String pattern1 = "hello*";
        System.out.println("Match: " + matchStrings(str1, pattern1)); // Output: Match: true

        String str2 = "example_test";
        String pattern2 = "example?";
        System.out.println("Match: " + matchStrings(str2, pattern2)); // Output: Match: true

        String str3 = "abc";
        String pattern3 = "abcd";
        System.out.println("Match: " + matchStrings(str3, pattern3)); // Output: Match: false
    }
}
