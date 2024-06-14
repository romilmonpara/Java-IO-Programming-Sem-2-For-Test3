import java.util.*;

public class Sem2_T3_12 {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(55);
        p.add(23);
        p.add(2);
        p.add(0);
        p.add(-5); // return boolean
        p.offer(50); // return boolean
        p.offer(11);
        p.offer(21);
        System.out.println(p); // [-5, 0, 11, 21, 2, 50, 23, 55]
        p.remove();
        System.out.println(p); // [0, 2, 11, 21, 55, 50, 23]
        p.poll();
        System.out.println(p); // [2, 21, 11, 23, 55, 50]
        System.out.println(p.peek()); // 2
        System.out.println(p.element()); // 2

        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        // p1.remove();
        // Exception in thread "main" java.util.NoSuchElementException

        System.out.println(p1.poll()); // null
        System.out.println(p1.peek()); // null

        // System.out.println(p1.element());
        // Exception in thread "main" java.util.NoSuchElementException

        Iterator<Integer> i = p.iterator();

        while (i.hasNext()) {
            System.out.print(i.next() + " "); // 2 21 11 23 55 50
        }
    }
}
