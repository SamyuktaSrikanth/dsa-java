/*
A power B 
Given 2 numbers - A and B, evaluate AB.

(Note: Do not use any inbuilt functions / libraries for your main logic.)
Input Format
The first line of input contains T - the number of test cases. It's followed by T lines, each line containing 2 numbers - A and B, separated by space.

Output Format
For each test case, print A^B, separated by new line. Since the result can be very large, print result % 1000000007

Constraints

1 <= T <= 1000
0 <= A <= 10^6
0 <= B <= 10^9
*/

//Time: O(logN)
//Space : O(1)
//Note: Simply multiplying A with itself B times will result in TLE if B is >10^9
//Also Note: Both divsion and bit manipulation yield same result. 
//Bit manipulation is slightly more faster

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long ans = 1;
            while(b > 0)
            {
                // last_bit = n & 1
                if(b % 2 != 0) //  last_bit> 1
                {
                    ans = (ans * a) % 1000000007;
                }
                a = (a * a) % 1000000007;
                b = b / 2; //b = b >> 1
            }
            System.out.println(ans);
        }
    }
}
