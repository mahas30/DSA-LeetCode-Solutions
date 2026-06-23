/*
Problem: Max Consecutive Ones
Problem No: 485
Difficulty: Easy
Topic: Arrays

Problem Statement:
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Approach:
Traverse the array and maintain a count of consecutive 1s.
If the current element is 1, increment the count and update the maximum count.
If the current element is 0, reset the count to 0.
Return the maximum count found during the traversal.

Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;

        for(int num : nums) {
            if(num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }
}