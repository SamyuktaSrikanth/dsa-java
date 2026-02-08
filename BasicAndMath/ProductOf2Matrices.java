import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N1 = sc.nextInt();
            int M1 = sc.nextInt();
            int mat1[][] = new int[N1][M1];
            for(int i = 0 ; i < N1 ; i++)
            {
                for(int j = 0 ; j < M1 ; j++)
                {
                    mat1[i][j] = sc.nextInt();
                }
            }
            int N2 = sc.nextInt();
            int M2 = sc.nextInt();
            int mat2[][] = new int[N2][M2];
            for(int i = 0 ; i < N2 ; i++)
            {
                for(int j = 0 ; j < M2 ; j++)
                {
                    mat2[i][j] = sc.nextInt();
                }
            }
            
            int mat3[][] = new int[N1][M2];
            //matrix multiplication
            for(int i = 0 ; i < N1 ; i++)
            {
                for(int j = 0 ; j < M2; j++)
                {
                    for(int k = 0 ; k < M1 ; k++)
                    {
                        mat3[i][j] += (mat1[i][k] * mat2[k][j]);
                    }
                }
            }
            for(int i = 0 ; i < N1 ; i++)
            {
                for(int j = 0 ; j < M2; j++)
                {
                    System.out.print(mat3[i][j]+" ");
                }
                System.out.println();
            }
            T--;
        }
    }
}
