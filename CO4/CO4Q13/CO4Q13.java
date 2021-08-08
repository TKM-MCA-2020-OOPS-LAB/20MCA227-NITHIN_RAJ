//Program to demonstrate the creation of queue object using the PriorityQueue class
package javaprograms;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class CO4Q13 {
    public static void main(String[] args) {
        int n;
        String str;
        PriorityQueue<String> pq = new PriorityQueue<String>();
        System.out.println("Enter the no. of data:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the data:");
        for(int i=0;i<n;i++)
        {
            str = sc.nextLine();
            pq.add(str);
        }
        Iterator itr = pq.iterator();
        System.out.println("\nPriority Queue\n");
        while(itr.hasNext())
            System.out.println(itr.next()+" ");
    }
}
