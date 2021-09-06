
package javaprograms;

import java.util.Scanner;


public class symmetric {
    public static void main(String[] args) {
        int r,c;
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        r = sc.nextInt();
        c = sc.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        if(r==c)
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    b[i][j] = a[j][i];
                }
            }
        }
        System.out.println("Transpose:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println("");
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               if(a[i][j]!=b[i][j])
	       {
	    	 flag = 1;
	    	 break;
	       }
            }
        }
        if(flag==0)
        {
            System.out.println("Symmetric");
        }
        else
        {
            System.out.println("Not Symmetric");
        }
    }
    
}
