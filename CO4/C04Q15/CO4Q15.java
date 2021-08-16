//Program to demonstrate the creation of Set object using the LinkedHashset class
package javaprograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CO4Q15 {
    public static void main(String[] args) {
        int n;
        String str;
        LinkedHashSet<String> lsh = new LinkedHashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of values");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            str = sc.nextLine();
            lsh.add(str);
        }
        System.out.println("\nOriginal LinkedHashSet:"+lsh);
        System.out.println("Removed 'Rachel' from LinkedHashSet:"+lsh.remove("Rachel"));
        System.out.println("Size of LinkedHashSet:"+lsh.size());
        System.out.println("Checking if 'Joey' is present:"+lsh.contains("Joey"));
        System.out.println("Final LinkedHashSet:"+lsh);
        System.out.println("\nIterating...");
        Iterator itr = lsh.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
    }
            
}
