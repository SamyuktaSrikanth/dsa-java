//Approach 1 - Storing bits in string and reversing it
//Computationally complex
//Time : O(T)
//Space : O(1)

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            
            for(int i = 31; i >= 0 ; i--)
            {
                if( (n & (1 << i)) != 0 )
                {
                    sb.append('1');
                }
                else
                {
                    sb.append('0');
                }
            }
           
            int len = sb.length();
            long ans = 0;
            for(int i = 0 ; i < len ; i++)
            {
                char ch = sb.charAt(i);
                if(ch == '1')
                {
                    ans += (Character.getNumericValue(ch)) * (1L << i);
                }
            }
            System.out.println(ans);
        }
    }
}
