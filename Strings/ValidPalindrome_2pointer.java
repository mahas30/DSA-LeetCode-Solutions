/*
Problem: Valid Palindrome
Category: Strings - Two Pointers
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
After ignoring spaces and punctuation and converting uppercase letters
to lowercase, the string becomes:
"amanaplanacanalpanama"

The resulting string reads the same forward and backward.

Approach:
Use two pointers, left and right.
The left pointer starts from the beginning of the string and the right
pointer starts from the end.

Skip all non-alphanumeric characters using the two pointers.
Then compare the characters at left and right after converting them
to lowercase.

If the characters are different, return false.
If they are equal, move both pointers toward the center.

If all valid characters match, return true.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right &&!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}

