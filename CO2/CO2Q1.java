
package javaprograms;

//Program to sort strings

import java.util.Scanner;


public class CO2Q1 
{
    public class sort
    {
        public void display(String s[],int n)
        {
            String temp;
            String str[] = s;
            for(int i=0;i<n;i++)
                for(int j=i+1;j<n;j++)
                    if(str[i].compareTo(str[j])>0)
                    {
                        temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                    }
            System.out.println("Sorted...");
            for(int i=0;i<n;i++)
                System.out.println(str[i]);
        }
    }
    public static void main(String[] args) 
    {
        int count;
        CO2Q1 obj = new CO2Q1();
        CO2Q1.sort ob = obj.new sort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        count = sc.nextInt();
        String str[] = new String[count];
        System.out.println("Enter "+count+" words");
        
        sc.nextLine();
        
        for(int i=0;i<count;i++)
        {
            str[i] = sc.nextLine();    
        }
        
        ob.display(str,count);

    }
}
