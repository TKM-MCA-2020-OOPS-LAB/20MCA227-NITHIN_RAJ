
package product;


public class product {
    int pcode;
    String pname;
    double price;
    
    void data(int c, String n, double p)
    {
        pcode = c;
        pname = n;
        price = p;
    }
    void display()
    {
        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
    }
    void small(double a, double b, double c)
    {
        if(a<b && a<c)
        {
            System.out.println("Product car is lower");
        }
        else if(b<c && b<a)
        {
            System.out.println("Product bike is lower");
        }
        else
        {
            System.out.println("Product van is lower");
        }
    }
    public static void main(String[] args) {
        product obj1 = new product();
        product obj2 = new product();
        product obj3 = new product();
        obj1.data(100,"car",25000);
        obj2.data(101,"bike",10000);
        obj3.data(102,"van",35000);
        System.out.println("Product_code\tProduct_name\tProduct_price");
        obj1.display();
        obj2.display();
        obj3.display();
        obj1.small(obj1.price,obj2.price,obj3.price);
        
    }
}
