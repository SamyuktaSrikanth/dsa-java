//Time: O(log2)
//Space: O(1)
// Repeated division by 2 
//if remainder is not zero then flag false
import java.io.*;
import java.util.*;

public class Main {
    public static boolean isPowerOf2(long n)
    {
        if(n == 0)
        {
            return false;
        }
        while( n != 1 )
        {
            if(n % 2 != 0)
            {
                return false;
            }
            n = n / 2;
        }
        return true;
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
