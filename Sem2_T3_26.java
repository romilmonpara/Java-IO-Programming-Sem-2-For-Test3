import java.util.*;
// to store mobile no. & name and find mobile no. through name.

public class Sem2_T3_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Long, String> h = new HashMap<>();
        String name;
        Long n;
        int count = 0;

        while (count != 4) {
            System.out.print("Enter Ur Name : ");
            name = sc.nextLine(); // sc.next();
            System.out.print("Enter Mobile No. : ");
            n = sc.nextLong();

            h.put(n, name);
            count++;
            sc.nextLine();
        }
        System.out.println(h);
        System.out.print("Enter name to know number : ");
        String kn = sc.nextLine();
        boolean b = true;
        // if key data is given to find value -> use containsKey method.

        for (Map.Entry<Long, String> x : h.entrySet()) {
            if (x.getValue().equalsIgnoreCase(kn)) {
                b = false;
                System.out.println("Number : " + x.getKey());
            }
        }

        if (b) {
            System.out.println("Data not Found!!!");
        }

        sc.close();
    }
}
