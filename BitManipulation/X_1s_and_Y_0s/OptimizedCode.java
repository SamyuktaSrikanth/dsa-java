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

//Time: O(T.(logX + logY))
//Space: O(1)
//Logic: 2^X -1 will yield number with binary representation with exactly X 1s
// Multiplying with 2^Y will shift the number to the left by Y places , thereby adding Y 0s

import java.io.*;
import java.util.*;

public class Main {
     
    static final long MOD = 1000000007;
    public static long modPower(long a , long b)
    {
        long ans = 1;
        while(b > 0)
        {
            if(b % 2 != 0)
            {
                ans = (ans * a) % MOD;
            }
            a = (a * a) % MOD;
            b = b / 2;
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();

       while(T-- >0)
       {
         long X = sc.nextLong();
         long Y = sc.nextLong();
         long ans = ((modPower(2,X)-1) + MOD) % MOD; // we are adding MOD to ensure negative value is avoided since we are subtracting -1
         ans = (ans * modPower(2,Y)) % MOD; 
         System.out.println(ans);

       }
    }
}
