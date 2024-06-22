import java.io.*;

// one emp.txt with first name, last name & salary read this file then store it 
// in tax.txt file with first name, last name & tax(10%).
public class Sem2_T3_28 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\emp123.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\tax123.txt"));

        String s = br.readLine();
        String a[];

        while (s != null) {
            a = s.split(" - ", 2);
            String name = a[0];
            Double sal = Double.parseDouble(a[1]);
            Double tax = (0.10) * (sal);
            String t = tax + " ";
            bw.write(name + " " + t);
            bw.newLine();
            s = br.readLine();
        }
        bw.flush();

        br.close(); bw.close();
    }
}
