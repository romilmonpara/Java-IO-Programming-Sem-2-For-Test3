import java.io.*; // java.File;
// Ch.7
public class Sem2_T3_1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("abab.txt");
        System.out.println(f1.exists()); // false

        System.out.println(f1.createNewFile()); // true
        // Once a file is created then it will print false.

        File f2 = new File("D:\\Zu.txt"); // Make file in D drive.
        System.out.println(f2.createNewFile()); // true

        // If we try to make a file in C: Drive then it will give "Access Denied"

        File f3 = new File("RK1.doc");
        System.out.println(f3.createNewFile()); // true

        // Make a folder
        // File f4 = new File("D:\\R4");
        // System.out.println(f4.mkdir());

        // When Folder is already created.
        // File f5 = new File("D:\\R4", "RK_4.txt");
        // System.out.println(f5.createNewFile());

        // getPath()
        System.out.println(f1.getPath()); // abab.txt

        // getAbsolutePath()
        System.out.println(f1.getAbsolutePath()); // D:\Test Programs\JAVA 2_Sem 2\T3 Programs\abab.txt

        // isFile()
        System.out.println(f1.isFile()); // true

        // isDirectory() -> Folder
        System.out.println(f1.isDirectory()); // false
        // System.out.println(f4.isDirectory()); // true

        // canRead()
        System.out.println(f1.canRead()); // true

        File f6 = new File("xyz.txt");
        System.out.println(f6.canRead()); // false -> File doesn't exist.

        // canWrite()
        System.out.println(f1.canWrite()); // true
        // false -> When we cjange file properties as Read-only.

        // length()
        System.out.println(f2.length()); // 0
        // enter & new line -> +2
        /* 
        File f8 = new File("C:\\xampp");
        System.out.println(f8.exists());

        String s[] = f8.list();
        for (String x : s) {
            System.out.println(x);
        }

        // with Absolute Path
        File f9 = new File("C:\\xampp");
        System.out.println(f9.exists());

        File f[] = f9.listFiles();
        for (File x : f) {
            System.out.println(x);
        }
        
        // equals
        System.out.println(f8.equals(f9)); */
        
    }
}