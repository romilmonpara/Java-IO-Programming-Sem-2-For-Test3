import java.util.*;

public class Sem2_T3_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, String> h = new Hashtable<>();
        h.put("Dog", "Animal");
        h.put("Car", "Vehicle");
        h.put("Java", "Computer Language");
        System.out.println(h);
        String s;

        while (true) {
            System.out.print("\nEnter the Word U want to find meaning : ");
            s = sc.nextLine();
            if(h.containsKey(s)) {
                System.out.println(s + " Meaning is : " + h.get(s));
            } else {
                System.out.println("Meaning not Found!!!");
                System.out.println("\nWould you like to enter the meaning(yes/no)??");
                String q = sc.nextLine();
                if (q.equalsIgnoreCase("yes")) {
                    System.out.print("\nWrite Meaning : ");
                    String m = sc.nextLine();
                    h.put(s, m);
                }
            }
            System.out.println("\nDo you want to find more(yes/no)??");
            String fm = sc.nextLine();
            if (fm.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("\nFinal : " + h);
    }
}
