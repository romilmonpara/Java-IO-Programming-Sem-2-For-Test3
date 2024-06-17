import java.io.*;

public class Sem2_T3_22 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Demo1.png");
        FileInputStream fis = new FileInputStream(f);
        byte b[] = new byte[(int) f.length()];
        // byte b[] = new byte[20000];
        fis.read(b);
        FileOutputStream fos = new FileOutputStream("D:\\Demo123.png");
        fos.write(b);
        
        fis.close(); fos.close();
    }
}
