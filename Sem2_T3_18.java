import java.util.*;
// HashMap -> Belong to Map Interface
// HashMap class impliments Map interface.
// in this class there is a combination of Key-Value. -> called as entry.
// both key & value are objects.
// Duplicate keys are not-allowed but values can be duplicate.
// Insertion order is not preserve, it's based on HashCode of the Key-Object,
// null insertion is allow.
public class Sem2_T3_18 {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<>();
        // 1. String put(int key, String value(-> name))
        // System.out.println(h.put(5, "xyz")); // null
        h.put(5, "xyz");
        h.put(7, "aaa");
        h.put(77, "RR");
        h.put(8, "xyxy");
        System.out.println(h); // {5=xyz, 7=aaa, 8=xyxy, 77=RR}
        
        // System.out.println(h.put(7, "mmm")); // aaa -> when we are change the value.
        h.put(7, "mmm");
        System.out.println(h); // {5=xyz, 7=mmm, 8=xyxy, 77=RR}

        // 2. boolean containsKey(Key obj)
        System.out.println(h.containsKey(77)); // true
        System.out.println(h.containsKey(99)); // false

        // print using for-each loop -> Unique for-each loop for HashMap
        for (Map.Entry<Integer, String> x : h.entrySet()) {
            if(x.getKey() % 2 == 0) {
                System.out.println(x.getKey() + "--" + x.getValue()); // 8--xyxy
            }
        }

        // print using iterator
        /*Iterator i = h.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<Integer, String> x = (Map.Entry<Integer, String>) i.next();
            if (x.getKey() % 2 == 0) {
                System.out.println(x.getKey() + "--" + x.getValue()); // 8--xyxy
            }
        } */

        // 3. String remove
        // System.out.println(h.remove(77)); // RR
        h.remove(77);
        System.out.println(h); // {5=xyz, 7=mmm, 8=xyxy}

        // 4. boolean remove(int key, String name)
        System.out.println(h.remove(5, "xyz")); // true
        System.out.println(h.remove(5, "abc")); // false
    }
}
