//Maintain a list of Strings using ArrayList from collection framework, perform built-in
//operations.
package javaprograms;
import java.util.*;

public class CO4Q10 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Strawberry");
	fruits.add("Mango");
	fruits.add("Pineapple");
	fruits.add("Banana");
	fruits.add(4, "Grapes");
        System.out.println("Fruits-");
        for(String str: fruits)
            System.out.println(str+" ");
        fruits.remove("Banana");
        fruits.remove(1);
        System.out.println("\t**********");
        System.out.println("Fruits after items removed");
        for(String str: fruits)
            System.out.println(str+" ");
        Collections.sort(fruits);
        System.out.println("\t**********");
        System.out.println("Sorted-");
        for(String str: fruits)
            System.out.println(str+" ");
        System.out.println("\t**********");
        System.out.println("Total fruits-"+fruits.size()); 
    }
}
