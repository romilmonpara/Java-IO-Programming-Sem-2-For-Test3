import java.io.*;

public class Sem2_T3_6 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Result4.txt"));

        BufferedReader b1 = new BufferedReader(new FileReader("D:\\odd.txt"));
        BufferedReader b2 = new BufferedReader(new FileReader("D:\\even.txt"));
        
        String o = b1.readLine();
        String e = b2.readLine();

        while (o != null || e != null) {
            if (o != null) {
                bw.write(o);
                bw.newLine();
                o = b1.readLine();
            }
            if (e != null) {
                bw.write(o);
                bw.newLine();
                e = b2.readLine();
            }
        }
        bw.close(); b1.close(); b2.close();
    }
}
