/*
Problem: Right-Aligned Half Pyramid Star Pattern
Category: Pattern Printing
Difficulty: Easy
Platforn: HackerRank

Problem Statement:
Given an integer n, print a right-aligned half pyramid of '*' with n rows.

Example:
Input:
4

Output:
      *
    * *
  * * *
* * * *

Approach:
Use two nested loops.
The first inner loop prints the required leading spaces to right-align the pattern.
The second inner loop prints the stars for the current row.
Repeat this for all n rows.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

import java.io.*;
import java.util.*;

public class  RightAlignedhalfPyramid_P2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}