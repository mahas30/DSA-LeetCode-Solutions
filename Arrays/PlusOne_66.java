/*
Problem : Plus One
LeetCode : 66
Difficulty: Easy

Problem Statement:
You are given a large integer represented as an integer array digits,
where each digit is stored in a separate element.
Add one to the integer and return the resulting array.

Approach:
Traverse from right to left.
If digit < 9, increment and return.
If digit == 9, make it 0 and continue.
If all digits are 9, create a new array with leading 1.

Time Complexity: O(n)
Space Complexity: O(1) 
*/
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}