import java.io.*;
// FileInputStream & FileOutputStream is also use to read & write text File but
// BufferedReader & BufferedWriter are more prefferable.

public class Sem2_T3_23 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\nothing1.txt");
        FileInputStream fis = new FileInputStream(f);
        int i = fis.read();
        while (i != -1) {
            System.out.print((char) i);
            i = fis.read();
        }

        fis.close();
    }
}
