import java.io.*;
/* xyz abc 41
 * xyz xyz 35
 * abc xyz 18
 */

public class Sem2_T3_29 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\stdata.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\finalStData.txt"));
        String r = br.readLine();
        while (r != null) {
            String a[] = r.split(" ");
            int m = Integer.parseInt(a[2]);
            if (m < 20) {
                bw.write(a[0] + " " + a[1] + " " + a[2]);
                bw.newLine();
            }
            r = br.readLine();
        }
        br.close(); bw.close();
    }
}
