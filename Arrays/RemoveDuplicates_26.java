/*
Problem: Remove Duplicates from Sorted Array
Category: Arrays - Two Pointers 
Problem No: 26
Difficulty: Easy
Platform: LeetCode

Problem Statement:
Given a sorted integer array nums, remove the duplicates in-place such that
each unique element appears only once. Return the number of unique elements.

Example:
Input:
nums = [1,1,2]

Output:
2

Modified Array:
[1,2,_]

Approach:
Use two pointers, cur and next.
The cur pointer keeps track of the position of the last unique element,
while the next pointer scans the array to find the next unique element.

If nums[cur] and nums[next] are equal, the element is a duplicate,
so only the next pointer is moved.

If they are different, the new unique element is placed at cur + 1,
and both pointers are moved forward.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int cur=0,next=1,k=1;
        while(next<nums.length){
            if(nums[cur]==nums[next]){
                next++;
            }else{
                nums[cur+1]=nums[next];
                k++;
                cur++;
                next++;
            }
        }
        return k;
    }
}