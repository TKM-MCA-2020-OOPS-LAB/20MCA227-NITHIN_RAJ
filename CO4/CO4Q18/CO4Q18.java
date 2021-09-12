
package javaprograms;
import java.util.*;

public class CO4Q18 {
    public static <i,s> Map<i,s> convert(Map<i,s> hashmap)
    {
        Map<i,s> treemap = new TreeMap<>();
        treemap.putAll(hashmap);
        return treemap;
    }
    public static void main(String[] args) {
        Map<String,Integer> hashmap = new HashMap<>();
        hashmap.put("Johnny Depp",1);
        hashmap.put("Tom Cruise",1);
        hashmap.put("Jackie Chan",1);
        hashmap.put("Keanu Reeves",1);
        System.out.println("HashMap:"+hashmap);
        Map<String,Integer>treemap = convert(hashmap);
        System.out.println("TreeMap:"+treemap);
    }
}
