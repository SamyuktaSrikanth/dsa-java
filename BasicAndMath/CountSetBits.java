//Time: O(1)
//Space: O(1)
// This approach uses bit manipulation
// Handles 64bit LONG numbers
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while( T > 0 )
        {
            long n = sc.nextLong();
            int count = 0;
            for(int i = 63 ; i >= 0; i--)
            {
                if((n & (1L << i)) != 0) count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
