/*
Problem: Right Triangle Star Pattern -1
Topic: Pattern Printing
Platform: HackerRank

Problem Statement:
Given an integer n, print a right-angled triangle pattern of '*' consisting of n rows.

Example:
Input:
5

Output:
*
* *
* * *
* * * *
* * * * *

Approach:
Use two nested loops.
The outer loop iterates through each row.
The inner loop prints stars equal to the current row number.

Time Complexity: O(n²)
Space Complexity: O(1)
*/


import java.io.*;
import java.util.*;

public class RightTriangle_P1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
       }
    }
}