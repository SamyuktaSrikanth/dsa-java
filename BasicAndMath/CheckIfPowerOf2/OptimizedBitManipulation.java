//Time: O(1)
//Space: O(1)
/*  Logic : if n is a power of 2 
            then n has one 1 in its binary representation
            n-1 has all 1s in its binary representation
            n & (n-1) always yields 0
*/
// Edge case : 0 is not power of 2
import java.io.*;
import java.util.*;

public class Main {
    public static boolean isPowerOf2(long n)
    {
        return ((n != 0)&&((n & (n-1)) == 0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            long n = sc.nextLong();
            if(isPowerOf2(n))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            T--;
        }
    }
}
