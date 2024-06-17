import java.io.*;

public class Sem2_T3_25 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("D:\\pqr.txt", "rw");
        raf.writeInt(12); // 4 bytes
        raf.writeDouble(2.3); // 8 bytes
        raf.writeChar('c'); // 2 bytes
        raf.writeFloat(2.5f); // 4 bytes
        raf.writeLong(123456789); // 8 bytes
        raf.writeBoolean(false); // 1 bytes

        System.out.println(raf.getFilePointer());
        // 4 -> 12 -> 14 -> 18 -> 26 -> 27
        raf.seek(0);
        System.out.println(raf.readInt()); // 12
        System.out.println(raf.getFilePointer()); // 4
        raf.seek(0);

        raf.close();
    }
}
