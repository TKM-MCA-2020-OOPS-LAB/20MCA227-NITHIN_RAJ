//Define 2 classes; one for generating Fibonacci numbers and other for displaying even
//numbers in a given range. Implement using threads. (Runnable Interface) 
package javaprograms;

import java.util.Scanner;

class Fibonacci implements Runnable
{
    int n,first,second,t;
    String str;
    
    public Fibonacci(int num) 
    {
        n = num;
        first = 0;
        second = 1;
    }
    
    @Override
    public void run() 
    {
        str = first+" "+second;
        for(int i=0;i<=n-3;i++)
        {
            t = first + second;
            first = second;
            second = t;
            str += " "+t;
        }
        System.out.println(str);
    }
    
}
class Even implements Runnable
{
    int n;
    String str;
    public Even(int n)
    {
        this.n = n;
        str = "";
    }
    @Override
    public void run() 
    {
        for(int i=0;i<n;i=i+2)
            if(i%2==0)
            {
                str+=i+" ";
            }
        System.out.println(str);
    }
    
}
public class CO4Q6 {
    public static void main(String[] args) throws InterruptedException {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of fibanocci series the user want:");
        n1 = sc.nextInt();
        Fibonacci fibob = new Fibonacci(n1);
        Thread th = new Thread(fibob);
        th.start();
        Thread.sleep(400);
        System.out.println("Enter the range of even numbers the user want:");
        n2 = sc.nextInt();
        Even evob = new Even(n2);
        Thread th2 = new Thread(evob);
        th2.start();
    }
}
