
package javaprograms;

//method overloading

import java.util.Scanner;


public class CO3Q1 
{
    double area(float r)
    {
        double pi = 3.14;
        double ar;
        ar = pi*r*r;
        return ar;
    }
    double area(float h,float b)
    {
        double ar;
        ar = (h*b)/2;
        return ar;
    }
    double area(double s)
    {
        double ar;
        ar = s*s;
        return ar;
    }
    double area(double l,double br)
    {
        double ar;
        ar = l*br;
        return ar;
    }
    public static void main(String[] args) 
    {
        CO3Q1 obj = new CO3Q1();
        int ch;
        float r,h,b;
        double s,l,br;
        System.out.println("Enter the option:");
        System.out.println("1. Area of the circle");
        System.out.println("2. Area of the triangle");
        System.out.println("3. Area of the square");
        System.out.println("4. Area of the rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Enter the radius:");
                    r = sc.nextFloat();
                    System.out.println(obj.area(r));
                    break;
            case 2: System.out.println("Enter the height and breadth:");
                    h = sc.nextFloat();
                    b = sc.nextFloat();
                    System.out.println(obj.area(h,b));
                    break;
            case 3: System.out.println("Enter the length of the side:");
                    s = sc.nextDouble();
                    System.out.println(obj.area(s));
                    break;
            case 4: System.out.println("Enter the length and breadth:");
                    l = sc.nextDouble();
                    br = sc.nextDouble();
                    System.out.println(obj.area(l,br));
                    break;
            default: System.out.println("Invalid choice.");
        }
    }
}
