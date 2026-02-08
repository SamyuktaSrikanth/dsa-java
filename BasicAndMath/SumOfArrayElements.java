//Contraint: If arr[i] > 10^9 then use long
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       while(T > 0)
       {
          int n = sc.nextInt();
          long arr[] = new long[n];
          for(int i = 0 ; i < n ; i++)
          {
            arr[i] = sc.nextLong();
          }
          long sum = 0;
          for(int i = 0 ; i < n ; i++)
          {
            sum += arr[i];
          }
          System.out.println(sum);
          T--;
       }
    }
}
