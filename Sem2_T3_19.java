import java.util.*;
// Hashtable
// in this class there is a combination of Key-Value. -> called as entry.
// both key & value are objects.
// Duplicate keys are not-allowed but values can be duplicate.
// Insertion order is not preserve, it's based on HashCode of the Key-Object,
// null insertion is not-allow, not as key as well value.
public class Sem2_T3_19 {
    public static void main(String[] args) {
        Hashtable<Integer, String> h = new Hashtable<>();
        h.put(2, "xyz");
        h.put(3, "abc");
        h.put(1, "RR");
        // h.put(null, "xy"); // RE
        // h.put(55, null); // RE
        // Exception in thread "main" java.lang.NullPointerException
        System.out.println(h); // {3=abc, 2=xyz, 1=RR}
    }
}
