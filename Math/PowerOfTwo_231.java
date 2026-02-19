/*
Problem : Power of Two
LeetCode : 231
Difficulty : Easy

Problem Statement :
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

Approach : A number is a power of 2 if has only one bit set.
Therefore, solved using bitwise trick : 
n>0 AND (n&(n-1))==0

Time complexity : O(1)
Space complexitiy : O(1)
*/

class Solution{
    public boolean isPowerOfTwo(int n){
        return n>0 && (n & (n-1))==0;
    }
}