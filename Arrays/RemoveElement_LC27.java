/*
Problem: Remove Element
Problem No: 27
Difficulty: Easy
Topic: Arrays, Two Pointers
Platform: LeetCode
Problem Statement:
Given an integer array nums and an integer val, remove all occurrences of val in-place and return the number of elements that are not equal to val.

Approach:
Use a write pointer (k) to store the position of the next valid element.
Traverse the array and copy each element that is not equal to val to nums[k].
Increment k whenever a valid element is placed.
Return k, which represents the number of remaining elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    } 
}

