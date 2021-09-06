
package javaprograms;

import java.util.Scanner;


public class Employee 
{
        int eNo;
        String eName;
        float eSalary;
        public void getdata()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employee No.");
            eNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Employee Name");
            eName = sc.nextLine();
            System.out.println("Enter the Salary");
            eSalary = sc.nextFloat();
        }
        public void display()
        {
            System.out.println("Employee Details:-");
            System.out.println("Employee No.= "+eNo);
            System.out.println("Employee Name= "+eName);
            System.out.println("Employee Salary= "+eSalary);
        }
        public static void main(String[] args) 
        {
        int n,i,en,ch=0;
        System.out.println("Enter the number of Employee details to be stored:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Employee[] obj= new Employee[n];
        for(i = 0;i<n;i++)
            obj[i] = new Employee();
        for(i=0;i<n;i++)
        {
            obj[i].getdata();
        }
        System.out.println("Enter the Employee No. to be display details:");
        en = sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(obj[i].eNo==en)
            {
                ch = i;
            }
        }
        obj[ch].display();

    }
}
