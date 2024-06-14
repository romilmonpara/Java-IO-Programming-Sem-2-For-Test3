import java.util.*;
// Priority Queue

public class Sem2_T3_11 {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(55);
        p.add(23);
        p.add(2);
        p.add(0);
        p.add(-5);
        p.add(99);
        p.add(42);
        p.add(77);
        p.add(3);
        p.add(1);
        p.add(22);

        System.out.println(p); // [-5, 0, 23, 3, 1, 99, 42, 77, 55, 2, 22]

        p.remove(); // without arg remove top of the tree
        System.out.println(p); // [0, 1, 23, 3, 2, 99, 42, 77, 55, 22]

        PriorityQueue<String> p2 = new PriorityQueue<>();
        p2.add("Zuzu");
        p2.add("Abc");
        p2.add("abab");
        p2.add("pqr");
        p2.add("zuzu");
        p2.add("XYZ");
        System.out.println(p2); // [Abc, Zuzu, XYZ, pqr, zuzu, abab]
    }
}
