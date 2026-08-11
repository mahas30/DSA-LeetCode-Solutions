/*
Problem: Reverse String II
Category: Strings - Two Pointers
Difficulty: Easy
Platform: LeetCode

Problem Statement:
Given a string s and an integer k, reverse the first k characters
for every 2k characters counting from the beginning of the string.

If there are fewer than k characters left, reverse all of them.
If there are at least k but fewer than 2k characters left, reverse
the first k characters and leave the remaining characters unchanged.

Example:
Input:
s = "abcdefg"
k = 2

Output:
"bacdfeg"

Approach:
Convert the string into a character array so that the characters can
be modified in-place.

Process the string in blocks of 2k characters.
For each block, use two pointers to reverse the first k characters.
The remaining k characters, if present, are left unchanged.

If fewer than k characters remain, Math.min() is used to ensure that
all remaining characters are reversed without going outside the array.

Time Complexity: O(n)
Space Complexity: O(n)
*/


class Solution {
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n;i+=2*k){
            int left=i;
            int right=Math.min(i+k-1,n-1);

            while(left<right){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}