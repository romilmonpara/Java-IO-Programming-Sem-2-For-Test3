import java.util.*;
// ArrayDeque -> preserve insertion order

public class Sem2_T3_15 {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        // 1. add() -> return boolean

        a.add(55);
        a.add(21);
        a.add(86);
        System.out.println(a); // [55, 21, 86]

        // 2. addFirst() -> return void
        a.addFirst(101);

        // 3. addLast() -> return void
        a.addLast(999);
        System.out.println(a); // [101, 55, 21, 86, 999]

        // 4. offerFirst() -> return boolean
        a.offerFirst(1);

        // 5. offerLast() -> return boolean
        a.offerLast(9);
        System.out.println(a); // [1, 101, 55, 21, 86, 999, 9]

        // 6. getFirst() -> return object
        System.out.println(a.getFirst()); // 1

        // 7. getLast() -> return object
        System.out.println(a.getLast()); // 9

        // 8. removeFirst() -> return int
        a.removeFirst();
        // a.remove();
        // System.out.println(a.removeFirst()); // 1

        // 9. removeLast() -> return int
        a.removeLast();
        System.out.println(a); // [101, 55, 21, 86, 999]

        // 10. isEmpty() -> return boolean
        System.out.println(a.isEmpty()); // false

        // 11. size() -> return int
        System.out.println(a.size()); // 5

        // 12. clear() -> return void
        a.clear();
        System.out.println(a); // []

        // System.out.println(a.getFirst());
        // Exception in thread "main" java.util.NoSuchElementException

        System.out.println(a.peek()); // null
    }    
}
