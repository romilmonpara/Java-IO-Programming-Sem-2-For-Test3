import java.io.*;
// Converting String into Character Array.
// WAP to display count of words, digits, alphabets, spaces, lines, characters of given file on Console.

public class Sem2_T3_9 {
    static int wordCount(String s) {
        String wc[] = s.split(" ");
        return wc.length;
    }

    static int digitCount(String s) {
        int count = 0;
        char ch[] = s.toCharArray();
        for (char c : ch) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    static int alphabetCount(String s) {
        int c = 0;
        char ch[] = s.toCharArray();
        for (char x : ch) {
            if(Character.isLetter(x)) {
                c++;
            }
        }
        return c;
    }

    static int spacesCount(String s) {
        int c = 0;
        char ch[] = s.toCharArray();
        for (char d : ch) {
            if (Character.isWhitespace(d)) {
                c++;
            }
        }
        return c;
    }

    static int characterCount(String s) {
        char ch[] = s.toCharArray();
        return ch.length;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("mydata1.txt"));
        String l = br.readLine();

        int wc = 0, dc = 0, ac = 0, sc = 0, lc = 0, cc = 0;
        while (l != null) {
            lc++;
            wc = wc + wordCount(l);
            dc = dc + digitCount(l);
            ac = ac + alphabetCount(l);
            sc = sc + spacesCount(l);
            cc = cc + characterCount(l);
            l = br.readLine();
        }
        System.out.println("Line Count : " + lc);
        System.out.println("Word Count : " + wc);
        System.out.println("Digit Count : " + dc);
        System.out.println("Alphabet Count : " + ac);
        System.out.println("Spaces Count : " + sc);
        System.out.println("Character Count : " + cc); 
        
        br.close();
    }
}
