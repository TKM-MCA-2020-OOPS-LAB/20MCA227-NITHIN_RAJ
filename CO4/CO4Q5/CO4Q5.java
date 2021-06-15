//Define 2 classes; one for generating multiplication table of 5 and other for displaying first
//N prime numbers. Implement using threads. (Thread class)
package javaprograms;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class MultiplicationTable extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
        for(int i=1;i<=10;i++)
        {
            try 
            {
                System.out.println("5 X "+i+" ="+(5*i));
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                
            }
        }
        System.out.println("Thread is finished");
        System.out.println("==================");
    }
}
class PrimeNumbers extends Thread
{
    public void run()
    {
      Scanner sc = new Scanner(System.in);
      int i =0;
      int num =0;
      String  primeNumbers = "";
      System.out.println("Enter the value of n:");
      int n = sc.nextInt();
      for (i = 1; i <= n; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    primeNumbers = primeNumbers + i + " ";
	 }	
      }	
      System.out.println("Prime numbers from 1 to n are :");
      System.out.println(primeNumbers);
    }
}
public class CO4Q5 {
    public static void main(String[] args) throws InterruptedException {
        MultiplicationTable MTOb = new MultiplicationTable();
        MTOb.start();
        Thread.sleep(5000);
        PrimeNumbers PNob = new PrimeNumbers();
        PNob.start();
    }
}
