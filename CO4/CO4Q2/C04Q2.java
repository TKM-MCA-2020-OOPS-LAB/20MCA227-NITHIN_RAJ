package c04q2;
//Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic
//operations. Test the package by implementing all operations on two given numbers
import arithmetic.operations;
import java.util.Scanner;
public class C04Q2 
{
    public static void main(String[] args) 
    {
        double n1,n2;
        int ch;
        operations ob = new operations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers:");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter the choice:");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:ob.addition(n1,n2);
                    break;
            case 2:ob.subtraction(n1,n2);
                    break;
            case 3:ob.multiplication(n1,n2);
                    break;
            case 4:ob.division(n1,n2);
                    break;
            default:System.out.println("Invalid choice");
        }
    }
    
}
