import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int k = 1;
        while(T > 0)
        {
            int n = sc.nextInt();
            System.out.println("Case #"+(k++)+":");
            for(int i = 1 ; i <= n ; i++) //row
            {
                for(int j = 1 ; j <= (n-i) ; j++) //space 
                {
                    System.out.print(" ");
                }
                for(int j = 1 ; j <= i ; j++) //star
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            T--;
        }
    }
}
