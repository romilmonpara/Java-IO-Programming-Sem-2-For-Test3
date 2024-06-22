import java.io.*;
// InputStreamReader

public class Sem2_T3_27 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\isr.txt");
        FileInputStream fis = new FileInputStream(f);

        InputStreamReader isr = new InputStreamReader(fis);
        // can't direct connect with file -> use FileInputStream
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println(s);

        // InputStreamReader ir = new InputStreamReader(System.in);
        // int x = ir.read();
        // System.out.println((char) x); // only first char will be print.
        
        br.close();
    }
}