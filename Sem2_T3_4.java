import java.io.*;
// BufferedWriter
// this class is used to wrtie data into the file.
// BufferedWriter can't male direct connection with file.

public class Sem2_T3_4 {
    public static void main(String[] args) throws IOException {
        // FileWriter fw1 = new FileWriter("D:\\Demo.txt");
        // BufferedWriter bw1 = new BufferedWriter(fw1);

        // Combine version
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("D:\\Demo.txt"));

        bw1.write(65); // 65
        bw1.write("BCD");
        bw1.newLine(); // we use for go to new line in String.
        bw1.write("End");
        bw1.close();

        
        // BufferedReader
        BufferedReader br1 = new BufferedReader(new FileReader("D:\\Demo.txt"));
        String l = br1.readLine();

        while (l != null) {
            System.out.println(l);
            l = br1.readLine();
        }
        // ABCD
        // End

        br1.close();
    }
}
