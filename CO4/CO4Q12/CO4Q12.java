//Program to remove an object from the Stack when the position is passed as parameter
package javaprograms;

import java.util.Scanner;
import java.util.Stack;

public class CO4Q12 {
    public static void main(String[] args) {
        int n;
        String str;
        Stack<String> s = new Stack<String>();
        System.out.println("Enter the number of elements:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            str = sc.nextLine();
            s.add(str);
        }
        System.out.println("\nStack elements:"+s);
        System.out.println("\nTop element:"+s.peek());
        System.out.println("Popped element:"+s.pop());
        System.out.println("Stack elements after popped:"+s);
        System.out.println("\nRemove Element at position 1:"+s.remove(0));
        System.out.println("Stack elements after removed:"+s);
        System.out.println("\nRemove Luke Skywalker:");
        s.remove("Luke Skywalker");
        System.out.println("Stack elements after removing Luke Skywalker:"+s);
    }
}
