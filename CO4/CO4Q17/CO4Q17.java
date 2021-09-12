//Program to demonstrate the working of Map interface by adding, changing and removing
//elements.
package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class CO4Q17 {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1,"The Professor(2018)");
        hm.put(2,"Jojo Rabbit(2019)");
        hm.put(3,"Just Mercy(2019)");
        hm.put(4,"Back to the Future(1985)");
        System.out.println("Map:"+hm);
        hm.put(4,"Back to the Future 2(1989)");
        System.out.println("Updated Map:"+hm);
        hm.remove(3);
        System.out.println("Final Map:"+hm);
    }
}
