//Time: O(T.1)
//Space: O(1)
//swap adjacent bits of 32 bits 
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int n = sc.nextInt();
            
            int evenPos = n & 0xAAAAAAAA ;
            int oddPos = n & 0x55555555 ;

            evenPos = evenPos >> 1;
            oddPos = oddPos << 1;

            n = evenPos | oddPos ;
            System.out.println(n);
        }
    }
}
