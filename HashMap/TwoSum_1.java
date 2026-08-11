/*
Problem: Two Sum
Category: HashMap
Difficulty: Easy
Platform: LeetCode

Problem Statement:
Given an integer array nums and an integer target, return the indices
of the two numbers such that they add up to target.

Each input has exactly one solution, and the same element cannot be used twice.

Example:
Input:
nums = [2, 7, 11, 15]
target = 9

Output:
[0, 1]

Approach:
Use a HashMap to store each number along with its index.
For every element, calculate the required value using target - nums[i].
Check if the required value already exists in the HashMap.
If it exists, return the stored index and the current index.
Otherwise, store the current number and its index in the HashMap.

Time Complexity: O(n)
Space Complexity: O(n)
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer , Integer> map=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
            if(map.containsKey(needed)){
                res[0]=map.get(needed);
                res[1]=i;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }