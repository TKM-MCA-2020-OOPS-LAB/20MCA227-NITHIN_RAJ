package javaprograms2;

//Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle,
//Square and Circle. Test the package by finding the area of these figures.
import Graphics.Shapes;
import java.util.Scanner;

public class CO4Q1 
{
    public static void main(String[] args) 
    {
        int ch;
        double l,b;
        Shapes ob = new Shapes();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("\n1.Rectangle\n2.Triangle\n3.Square\n4.Circle\n5.Exit\nEnter your choice:");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter the length and breadth:");
                        l = sc.nextDouble();
                        b = sc.nextDouble();
                        ob.Rectangle(l, b);
                        break;
                case 2:System.out.println("Enter the breadth and height:");
                        l = sc.nextDouble();
                        b = sc.nextDouble();
                        ob.Triangle(l, b);
                        break;
                case 3:System.out.println("Enter the side:");
                        l = sc.nextDouble();
                        ob.Square(l);
                        break;
                case 4:System.out.println("Enter the radius:");
                        l = sc.nextDouble();
                        ob.Circle(l);
                        break;
                case 5:System.exit(0);
                        break;
                default:System.out.println("Invalid choice");
            }
        }while(true);
    }
}
