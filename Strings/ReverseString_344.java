/*
Problem: Reverse String
Category: Strings - Two Pointers
Difficulty: Easy
Platform: LeetCode

Problem Statement:
Write a function that reverses a string in-place.
The input is given as a character array s.

You must modify the input array in-place with O(1) extra memory.

Example:
Input:
s = ["h","e","l","l","o"]

Output:
["o","l","l","e","h"]

Approach:
Use two pointers, one starting from the beginning of the array and the
other starting from the end.

Swap the characters at the two pointer positions and then move the left
pointer forward and the right pointer backward.

Continue until the two pointers meet or cross each other.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}