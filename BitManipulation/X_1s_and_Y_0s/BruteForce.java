/*
Given two numbers X and Y, find the number whose binary representation has X 1's followed by Y 0's.

Input Format
The first line of input contains T - the number of test cases. It's followed by T lines. Each subsequent line contains two integers separated by a space: X - the number of the 1's and Y - the number of 0's which follows the X 1's in the binary representation of the number.

Output Format
For each test case, print the number whose binary representation has X 1's and Y 0's, separated by a new line. Since this number can be very large, print the result % 1000000007.

Constraints
1 <= T <= 105
0 <= X,Y <= 105

Example
Input
3
4 3
2 5
10 15

Output
120
96
33521664

*/
//Time : O(T.(X+Y))
//Space: O(1)
//Note: Will cause TLE because 0<=T<=10^5 and 0<=X,Y<=10^5  which means we have about 10^5 . 10^5 = 10^10 iterations

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            long ans = 0;

            while (x > 0) {
                ans = (ans << 1) % 1000000007;
                ans = (ans | 1) % 1000000007;
                x--;
            }

            while (y > 0) {
                ans = (ans << 1) % 1000000007;
                y--;
            }

            System.out.println(ans);
        }
    }
}
