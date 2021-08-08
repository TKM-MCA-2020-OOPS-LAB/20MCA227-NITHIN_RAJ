//Program to demonstrate the addition and deletion of elements in deque
package javaprograms;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class CO4Q14 {
    public static void main(String[] args) {
        int ch;
        String data;
        Deque<String> dq = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("\nChoose a number...");
            System.out.println("1.Insert the element at first");
            System.out.println("2.Insert the element at last");
            System.out.println("3.Delete the element at first");
            System.out.println("4.Delete the element at last");
            System.out.println("5.Display");
            System.out.println("6.Exit");
            System.out.println("\nEnter the choice:");
            ch = sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1: System.out.println("Enter the element to be inserted at first:");
                        data = sc.nextLine();
                        dq.addFirst(data);
                        break;
                case 2: System.out.println("Enter the element to be inserted at last:");
                        data = sc.nextLine();
                        dq.addLast(data);
                        break;
                case 3: System.out.println("Element deleted from the first position");
                        dq.removeFirst();
                        break;
                case 4: System.out.println("Element deleted from the last position");
                        dq.removeLast();
                        break;
                case 5: System.out.println("Elements:");
                        System.out.println(dq);
                        break;
                case 6: System.exit(0);
                        break;
                default:System.out.println("Invalid choice...");
            }
        }while(true);
    }
}
