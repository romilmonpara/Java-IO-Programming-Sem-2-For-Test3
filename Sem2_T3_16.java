import java.util.*;

// HashSet Class -> this class impliment set interface.
// indertion order is not preserve. It is based on hashcode of the object.
// Duplicate objects are not allowed.
// null insertion is possible. 
public class Sem2_T3_16 {
    public static void main(String[] args) {
        // Default Initial Capacity = 16, fill ratio .Or. load factor = 0.75

        // HashSet<Integer> h1 = new HashSet<>(20);
        // when we want to change fill ratio -> 0.85f (float value)
        
        HashSet<Integer> h = new HashSet<>();
        // 1. boolean add(object)
        System.out.println(h.add(21)); // true   
        System.out.println(h.add(86)); // true
        System.out.println(h.add(55)); // true
        System.out.println(h.add(21)); // false
        System.out.println(h.add(null)); // true
        System.out.println(h); // [null, 21, 86, 55]

        // 2. boolean remove(object)
        System.out.println(h.remove(55)); // true
        System.out.println(h.remove(999)); // false

        // 3. boolean isEmpty()
        System.out.println(h.isEmpty()); // false

        // 4.void clear()
        h.clear();
        System.out.println(h); // []

        // Most IMP
        // 5. addAll() -> jisne call karaya usme change hoga to true.
        // 6. removeAll()
        HashSet<Integer> h2 = new HashSet<>();
        h2.add(1);
        h2.add(2);
        h2.add(3);

        HashSet<Integer> h3 = new HashSet<>();
        h3.add(2);
        h3.add(3);
        h3.add(4);

        System.out.println(h2.addAll(h3)); // true
        System.out.println(h2.removeAll(h3)); // true
        System.out.println(h2); // [1]

        // 7. print using iterator
        Iterator<Integer> i = h2.iterator();

        while (i.hasNext()) {
            System.out.print(i.next() + " "); // 1
        }
    }
}
