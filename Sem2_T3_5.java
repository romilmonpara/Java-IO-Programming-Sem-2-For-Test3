import java.io.*;

public class Sem2_T3_5 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\OE1.txt"));

        BufferedReader br1 = new BufferedReader(new FileReader("D:\\even.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("D:\\odd.txt"));

        String o = br1.readLine();
        while (o != null) {
            bw.write(o);
            bw.newLine();
            o = br1.readLine();
        }

        String e = br2.readLine();
        while (e!= null) {
            bw.write(e);
            bw.newLine();
            e = br2.readLine();
        }
        bw.close(); br1.close(); br2.close();
    }    
}
