
package javaprograms;

import java.util.Scanner;

public class CO2Q2 
{
    public static void main(String[] args) 
    {
        int count,flag=0;
        int pos = 0;
        String t;
        System.out.println("Enter the number elements to be inserted");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        String str[] = new String[count];
        sc.nextLine();
        System.out.println("Enter the elements");
        for(int i=0;i<count;i++)
            str[i] = sc.nextLine();
        System.out.println("Enter the element to be searched");
        t = sc.nextLine();
        for(int i=0;i<count;i++)
        {
            if(str[i].equals(t))
            {
                flag = 1;
                pos = i;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Element is in position "+(pos+1));
        }
        else
        {
            System.out.println("Element is not found");
        }
    }
}
