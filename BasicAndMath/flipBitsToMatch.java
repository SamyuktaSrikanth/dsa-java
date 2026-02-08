//Time : O(1)  (O(T*k))
//Space : O(1)
//Logic : XOR between A and B gives the sets the bits that are different in the result
//Counting the bits in the result gives the number of bits to flip
import java.io.*;
import java.util.*;

public class Main {

    public static int countSetBits(int n)
    {
        int count = 0;
        for(int i = 31 ; i >= 0 ; i--)
        {
            if((n & (1<<i)) != 0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xorValue = (a^b);

            int count = countSetBits(xorValue);
            System.out.println(count);
        }
    }
}
