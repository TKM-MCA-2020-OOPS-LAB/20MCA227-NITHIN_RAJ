
package javaprograms;


public class complex {
    double real,img;
    complex(double a,double b)
    {
        real = a;
        img = b;
    }
    public static complex sum(complex c1,complex c2)
    {
        complex t = new complex(0,0);
        t.real = c1.real + c2.real;
        t.img = c1.img + c2.img;
        return t;
    }
    public static void main(String[] args) {
        complex c1 = new complex(12,3);
        complex c2 = new complex(4,5);
        complex add = sum(c1,c2);
        System.out.println("Sum:"+add.real+"+"+add.img);
    }
}
