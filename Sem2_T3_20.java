import java.io.*;
import java.util.*;
// There is one txt file in D Drive --> read data and entry in HashMap.
public class Sem2_T3_20 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("D:\\data1.txt"));
        String l = br.readLine();
        HashMap<Integer, String> h = new HashMap<>();

        while (l != null) {
            String s[] = l.split(" ", 2);
            int x = Integer.parseInt(s[0]);
            String w = s[1];
            h.put(x, w);
            l = br.readLine();
        }
        System.out.println(h); // {1=rrr, 2=abc, 3=xyz}

        System.out.print("Enter Roll No. to know Name : ");
        int r = sc.nextInt();

        if (h.containsKey(r)) {
            System.out.println(h.get(r));
        } else {
            System.out.println("Data not Found!!!");
        }
        br.close(); sc.close();
    }
}
