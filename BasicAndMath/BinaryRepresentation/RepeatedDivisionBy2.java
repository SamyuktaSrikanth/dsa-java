//Time: O(nlogn)
//Space:O(1)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            
            if (n == 0) {  //Edge Case
                System.out.println(0);
                continue;
            }

            StringBuilder sb = new StringBuilder();
            while (n > 0) {
                sb.append(n % 2);
                n /= 2;
            }

            System.out.println(sb.reverse());
        }
    }
}
