/*
Problem: Valid Palindrome
Category: Strings - StringBuilder
Difficulty: Easy
Platform: LeetCode

Problem Statement:
Given a string s, determine whether it is a palindrome, considering
only alphanumeric characters and ignoring cases.

A palindrome is a sequence that reads the same forward and backward.

Example:
Input:
s = "A man, a plan, a canal: Panama"

Output:
true

Explanation:
After removing non-alphanumeric characters and converting all letters
to lowercase:
"amanaplanacanalpanama"

This string reads the same forward and backward.

Approach:
Use a StringBuilder to create a cleaned version of the string.
Traverse the input string and add only alphanumeric characters to the
StringBuilder after converting them to lowercase.

Convert the cleaned StringBuilder into a String and store it as the
original string.

Reverse the StringBuilder using the built-in reverse() method and
convert it into a String.

Compare the original string with the reversed string.
If both are equal, the input is a palindrome.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                clean.append(Character.toLowerCase(c));
            }
        }

        String original = clean.toString();

        clean.reverse();

        String reversed = clean.toString();

        return original.equals(reversed);
    }
}