/*
Problem: Majority Element
Category: Arrays - Boyer-Moore Voting Algorithm
Difficulty: Easy
Platform: LeetCode

Problem Statement:
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than n/2 times.

You may assume that the majority element always exists in the array.

Example:
Input:
nums = [2,2,1,1,1,2,2]

Output:
2

Approach:
Use the Boyer-Moore Voting Algorithm.
Maintain a candidate element and a count.

If the count becomes zero, select the current element as the new candidate.
If the current element is equal to the candidate, increase the count.
Otherwise, decrease the count.

Since the majority element appears more than n/2 times, it cannot be
completely cancelled by all the other elements and will remain as the
final candidate.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int majorityElement(int[] nums) {
        int candidate=-1,count=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
