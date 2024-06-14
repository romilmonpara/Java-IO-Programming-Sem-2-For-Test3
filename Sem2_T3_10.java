import java.io.*;
public class Sem2_T3_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Sample1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("abab.txt"));
        String l = br.readLine();

        while (l != null) {
            String w[] = l.split(" ");
            for (String x : w) {
                if(x.equals("hi")) {
                    bw.write("hello ");
                } else {
                    bw.write(x + " ");
                }
            }
            bw.newLine();
            // bw.flush();
            l = br.readLine();
        }
        bw.flush();
        
        br.close(); bw.close();
    }
}
