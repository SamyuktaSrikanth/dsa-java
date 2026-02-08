//Time : O(1)
//Space : O(1)
//Logic : Check each bit of number from MSB to LSB (31 to 0) and append to string 
// To check if a bit is set (n & (1 << i)) != 0

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T > 0)
        {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            boolean started = false;

            if(n == 0)
            {
                System.out.println(0); //edge case
            } 

            for(int i = 31 ; i >=0 ; i--)
            {
                if((n & (1<<i)) != 0) // bit is set
                {
                    sb.append(1);
                    started = true; //to prevent adding leading zeroes
                }
                else if(started)
                {
                    sb.append(0);
                }
            }
            System.out.println(sb);
            T--;
        }
    }
}
