import java.util.*;

public class Sem2_T3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();
        System.out.println("Enter Number : ");
        int n;
        while ((n = sc.nextInt()) != 0) {
            h.add(n);
        }
        System.out.println(h);

        Iterator<Integer> i = h.iterator();
        int sum = 0;
        while (i.hasNext()) {
            sum = sum + i.next();
        }
        System.out.println("Sum is : " + sum);

        // for (Integer x : h) {
        //     sum = sum + x;
        // }
        sc.close();
    }
}
