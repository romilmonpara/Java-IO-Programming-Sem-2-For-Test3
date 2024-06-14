import java.io.*;
// Find Writer class is used to write character data inside the file.
// This class contains following methods.
/* 1- write(int)
 * 2- write(String)
 * 3- write(char[])
 * 4- flush()
 * 5- close
 */
public class Sem2_T3_2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Sample1.txt");
        FileWriter fw1 = new FileWriter(f1, true);
        fw1.write(65); // A
        fw1.write("BCD");
        fw1.write("\nEFG");
        fw1.flush();

        char ch[] = {'H', 'I', 'J'};
        fw1.write(ch);
        fw1.close();
        // jetli var run karisu tetli var data enter thase
        // fw1.write("Bye"); // error -> Stream closed
    }
}
