/*
Problem : Single Number
LeetCode : 136
Difficulty : Easy

Approach : Bit Manipulation - XOR calculation 

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int num:nums){
            res=res^num;
        }
        return res;
    }
}