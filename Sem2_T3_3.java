import java.io.*;
// File Reader class to read data of any file char by char.
// this class contains three methods.
/* 1. int read()
 * 2. ch read()
 * 3. close()
 */
public class Sem2_T3_3 {
    public static void main(String[] args) throws Exception {
        FileReader fr1 = new FileReader("Sample1.txt");
        int i = fr1.read();

        while (i != -1) {
            System.out.print((char) i);
            i = fr1.read();
        }
        fr1.close();
    }
}
