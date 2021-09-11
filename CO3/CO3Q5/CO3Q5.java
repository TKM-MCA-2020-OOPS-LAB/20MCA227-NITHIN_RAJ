//Create classes Student and Sports. Create another class Result inherited from Student and
//Sports. Display the academic and sports score of a student. 
package javaprograms;

import java.util.Scanner;

interface results
{
    void getdata();
    int display();
}

class Student implements results
{
    int std_id,std_tmark;
    String std_name;
    @Override
    public void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        std_name = sc.nextLine();
        System.out.println("Enter the student id:");
        std_id = sc.nextInt();
        System.out.println("Enter total academic mark:");
        std_tmark = sc.nextInt();
    }
    @Override
    public int display()
    {
        System.out.println("\t--------Student details--------");
        System.out.println("Student name: " +std_name);
        System.out.println("Student id: " +std_id);
        System.out.println("Total mark:" +std_tmark);
        return std_tmark;
    }
}

class Sports implements results
{
    int tmarks;
    @Override
    public void getdata() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained in sports:");
        tmarks = sc.nextInt();
    }
    @Override
    public int display()
    {
        System.out.println("Marks obtained in Sports:"+ tmarks);
        return tmarks;
    }
    
}
public class CO3Q5 
{
    public static void main(String[] args) 
    {
        int mark;
        Student ob = new Student();
        Sports obj = new Sports();
        ob.getdata();
        obj.getdata();
        mark = ob.display();
        mark = mark + obj.display();
        System.out.println("Marks(Academic+Sports)="+ mark);
    }
}
