import java.io.*;
import java.util.*;
// One file with random numbers and write Sorted in another file.

public class Sem2_T3_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new FileReader("D:\\number123.txt"));
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("D:\\sortednum123.txt"));

        ArrayList<Integer> a = new ArrayList<>();
        String l = br1.readLine();
        while (l != null) {
            int i = Integer.parseInt(l);
            a.add(i);
            l = br1.readLine();
        }
        Collections.sort(a);

        for (Integer x : a) {
            String r = x + " ";
            bw1.write(r);
            bw1.newLine();
            bw1.flush();
        }

        br1.close(); bw1.close();
    }
}
