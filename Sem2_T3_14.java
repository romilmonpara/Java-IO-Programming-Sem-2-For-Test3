import java.util.*;
// Take 10 int numbers from the user & print max three numbers with the help priority queue.

public class Sem2_T3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            p.add(n);
            // p.add(sc.nextInt());
        }
        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.poll());

        sc.close();
    }
}
