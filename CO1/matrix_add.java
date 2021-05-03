
package javaprograms;

import java.util.Scanner;


public class matrix_add {
      
    public static void main(String[] args) {
        int m,n;
        int mat1[][]= new int[3][3];
        int mat2[][]= new int[3][3];
        int sum[][] = new int[3][3];
        System.out.println("Enter the number of rows and column");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter the values of the first matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               mat1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the values of the second matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               mat2[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               sum[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("Sum:-");
        for(int i=0;i<m;i++)
        {
            System.out.println("\n");
            for(int j=0;j<n;j++)
            {
                System.out.print(sum[i][j]+"\t");
                
            }
        }
    }
}
