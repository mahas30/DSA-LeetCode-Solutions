/*
Problem: Majority Element
Category: Arrays - HashMap
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
Use a HashMap to store each element along with its frequency.
Traverse through the array and increase the count of each element using
getOrDefault().
After updating the frequency, check whether the current element appears
more than n/2 times.
If it does, return that element as the majority element.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

            if(map.get(num)>nums.length/2){
                return num;
            }
        }
        return -1;
    }
}