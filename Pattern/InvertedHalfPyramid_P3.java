/*
Problem: Inverted Half Pyramid Star Pattern
Category: Pattern Printing
Difficulty: Easy
Platform: HackerRank

Problem Statement:
Given an integer n, print an inverted half pyramid of '*' consisting of n rows.

Example:
Input:
4

Output:
* * * *
* * *
* *
*

Approach:
Use two nested loops.
The outer loop iterates from n down to 1.
The inner loop prints stars equal to the current row number.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

import java.io.*;
import java.util.*;

public class InvertedHalfPyramid_P3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
