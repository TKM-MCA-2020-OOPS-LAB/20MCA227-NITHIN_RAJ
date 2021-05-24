//Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor
//to initialize the data members and another class ‘Employee’ that inherits the properties of
//class Person and also contains its own data members like Empid, Company_name,
//Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits
//the properties of class Employee and contains its own data members like Subject,
//Department, Teacherid and also contain constructors and methods to display the data
//members. Use array of objects to display details of N teachers. 

package product;

import java.util.Scanner;


class Person
{
    String Name;
    String Gender;
    String Address;
    int Age;
    Person()
    {
        
    }
    Person(String name, String gender, String addr, int age)
    {
        Name = name;
        Gender = gender;
        Address = addr;
        Age = age;
    }
}

class Employee extends Person
{
    int Empid;
    String Company_name;
    String Qualification;
    float Salary;
    Employee()
    {
        
    }
    public Employee(String name, String gender, String addr, int age) 
    {
        super(name, gender, addr, age);
    }
    public Employee(int id,String name, String qual, float sal)
    {
        Empid = id;
        Company_name = name;
        Qualification = qual;
        Salary = sal;
    }
    
}
class Teacher extends Employee
{
    String Subject;
    String Department;
    String Teachersid;
    Teacher()
    {
        
    }
    Teacher(String sub, String dept, String id)
    {
        Subject = sub;
        Department = dept;
        Teachersid = id;
    }
    public void display()
    {
        System.out.println("Name:" + Name);
	System.out.println("Age:" + Age);
	System.out.println("Gender:" + Gender);
	System.out.println("Address:" + Address);
	System.out.println("Emp id:" + Empid);
	System.out.println("Salary:" + Salary);
	System.out.println("Qualification:" + Qualification);
	System.out.println("Company Name:" + Company_name);
	System.out.println("Teacher id:" + Teachersid);
	System.out.println("Subject:" + Subject);
	System.out.println("Department:" + Department);
        System.out.println("\n\n");
    }
}

public class CO3Q3 
{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter the no. of Teachers:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Teacher obj[] = new Teacher[n];
        for(int i=0;i<n;i++)
            obj[i] = new Teacher();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("\t*****");
            System.out.println("Enter the name:");
            obj[i].Name = sc.nextLine();
            
            System.out.println("Enter the Age:");
            obj[i].Age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Gender:");
            obj[i].Gender = sc.nextLine();
            System.out.println("Enter the Address:");
            obj[i].Address = sc.nextLine();
            System.out.println("Enter the Emp id:");
            obj[i].Empid = sc.nextInt();
            System.out.println("Enter the Salary:");
            obj[i].Salary = sc.nextFloat();
            sc.nextLine();
            System.out.println("Enter the Qualification:");
            obj[i].Qualification = sc.nextLine();
            System.out.println("Enter the Company Name:");
            obj[i].Company_name = sc.nextLine();
            System.out.println("Enter the Teacher id:");
            obj[i].Teachersid = sc.nextLine();
            System.out.println("Enter the Subject:");
            obj[i].Subject = sc.nextLine();
            System.out.println("Enter the Department:");
            obj[i].Department = sc.nextLine();
        }
        System.out.println("\t***************");
        System.out.println("Teachers Details:-\n");
        for(int i=0;i<n;i++)
            obj[i].display();
    }
    
}
