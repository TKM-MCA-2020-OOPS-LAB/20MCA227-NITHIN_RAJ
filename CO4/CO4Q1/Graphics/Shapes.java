
package Graphics;
//Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle,
//Square and Circle. Test the package by finding the area of these figures.
interface figures
{
    void Rectangle(double a,double b);
    void Triangle(double a,double b);
    void Square(double a);
    void Circle(double a);
}

public class Shapes implements figures
{
    @Override
    public void Rectangle(double a,double b)
    {
        System.out.println("Area:"+(a*b));
    }
    @Override
    public void Triangle(double a,double b)
    {
        System.out.println("Area:"+((a*b)/2));
    }
    @Override
    public void Square(double a) 
    {
        System.out.println("Area:"+(a*a));
    }
    @Override
    public void Circle(double a) 
    {
        double pi = 3.14;
        System.out.println("Area:"+(pi*a*a));
    }
    public static void main(String[] args) {
        
    }
}
