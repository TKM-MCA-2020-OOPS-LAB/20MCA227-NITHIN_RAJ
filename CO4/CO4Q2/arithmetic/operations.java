
package arithmetic;

interface basic
{
    void addition(double a,double b);
    void subtraction(double a,double b);
    void multiplication(double a,double b);
    void division(double a,double b);
}


public class operations implements basic
{
    @Override
    public void addition(double a, double b) {
        System.out.println(a+" + "+b+" = "+(a+b));
    }

    @Override
    public void subtraction(double a, double b) {
        System.out.println(a+" - "+b+" = "+(a-b));
    }

    @Override
    public void multiplication(double a, double b) {
        System.out.println(a+" x "+b+" = "+(a*b));
    }

    @Override
    public void division(double a, double b) {
        System.out.println(a+" / "+b+" = "+(a/b));
    }
    
}
