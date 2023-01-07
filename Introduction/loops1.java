/*Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer,n, print its first  multiples. Each multiple n x i (where 1 <= i <= 10 ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, n.

Constraints

2 <= n <= 20

Output Format

Print 10 lines of output; each line i (where 1 <= i <= 10 ) contains the result of n x i in the form:
n x i = result.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=10 ; i++){
            System.out.println(n + " x "+i+" = "+i*n);
        }
    }
}
