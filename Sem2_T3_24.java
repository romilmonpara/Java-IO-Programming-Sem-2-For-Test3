import java.io.*;
// RandomAccessFile class -> It's works on byte mode.

public class Sem2_T3_24 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("D:\\AbAb.txt", "rw");
        // r -> only read && rw -> read-write both
        // Exception in thread "main" java.io.IOException: Access is denied
        // when only r is written as a argument and try to write.
        String s = "Hello Student";
        raf.write(s.getBytes());
        System.out.println(raf.getFilePointer()); // 13
        raf.seek(6);
        System.out.println((char) raf.read()); // S
        raf.seek(0);
        System.out.println((char) raf.read()); // H
        raf.seek(6);

        byte b[] = new byte[3];
        raf.read(b);
        for (byte c : b) {
            System.out.print((char) c); // Stu
        }
        System.out.println("\n" + raf.getFilePointer()); // 9
        
        raf.close();
    }
}
