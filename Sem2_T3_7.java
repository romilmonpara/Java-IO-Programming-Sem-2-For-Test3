import java.io.*;

public class Sem2_T3_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new FileReader("D:\\Demo4.txt"));
        int word = 0;
        String l = b.readLine();

        while (l != null) {
            String w[] = l.split(" ");
            word = word + w.length;
            l = b.readLine();
        }
        System.out.println("Word Count : " + word);

        b.close();
    }
}
