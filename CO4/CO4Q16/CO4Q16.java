//Write a Java program to compare two hash set
package javaprograms;
import java.util.*;

public class CO4Q16 {
    public static void union(Set<String> s1,Set<String> s2)
    {
        Set<String> su = new HashSet<>(s1);
        su.addAll(s2);
        System.out.println("Union:"+su);
    }
    public static void intersection(Set<String> s1,Set<String> s2)
    {
        Set<String> su = new HashSet<>(s1);
        su.retainAll(s2);
        System.out.println("Intersection:"+su);
    }
    public static void difference(Set<String> s1,Set<String> s2)
    {
        Set<String> su1 = new HashSet<>(s1);
        su1.removeAll(s2);
        Set<String> su2 = new HashSet<>(s2);
        su2.removeAll(s1);
        System.out.println("Difference:First HashSet- "+su1+" and Second HashSet- "+su2);
    }
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("Tokyo");
        s1.add("Berlin");
        s1.add("Rio");
        Set<String> s2 = new HashSet<>();
        s2.add("Tokyo");
        s2.add("Berlin");
        s2.add("Denver");
        System.out.println("Elements in first HashSet:"+s1);
        System.out.println("Elements in second HashSet:"+s2);
        union(s1,s2);
        intersection(s1,s2);
        difference(s1,s2);
    }
}
