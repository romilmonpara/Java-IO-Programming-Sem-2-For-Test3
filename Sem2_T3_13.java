import java.util.*;
/* -> Create a class named Team eith 3 instance variable name, Wcount, Lcount.
 * -> through psvm create 5 team and store them in priority queue.
 * -> for the upcoming match remove 2 teams from the queue which has highest Win Lose
 *    Difference and print the name of these 2 teams.
 */

class Team {
    String name;
    int Wcount;
    int Lcount;

    public Team(String name, int wcount, int lcount) {
        this.name = name;
        Wcount = wcount;
        Lcount = lcount;
    }
    
    public int getWL() {
        return Wcount - Lcount;
    }
}

public class Sem2_T3_13 {
    public static void main(String[] args) {
        Team t1 = new Team("CSK", 8, 2);
        Team t2 = new Team("RCB", 1, 9);
        Team t3 = new Team("SRH", 7, 3);
        Team t4 = new Team("GT", 6, 4);
        Team t5 = new Team("RR", 5, 5);

        PriorityQueue<Team> p = new PriorityQueue<>(Comparator.comparing(Team::getWL).reversed());
        p.add(t1);
        p.add(t2);
        p.add(t3);
        p.add(t4);
        p.add(t5);

        Team x = p.poll(); // CSK
        Team y = p.poll(); // SRH

        System.out.println(x.name);
        System.out.println(y.name);
        // System.out.println((p.poll()).name);
    }
}
