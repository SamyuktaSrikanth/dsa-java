//Time : O(T)
//Space: O(1)
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int n = sc.nextInt();

            long ans = 0;
            for(int i = 31 ; i >= 0 ; i--)
            {
                ans = ans << 1; //left shift answer

                if( (n & 1) == 1 ) ans |= 1;

                n = n >> 1;; //right shift n
            }
            System.out.println(ans);

        }
    }
}
