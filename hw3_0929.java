import java.util.*;

class ticketClass implements Runnable {
    static int ticket = 10;
    int tTicket;
    Thread t;

    ticketClass(String name) {
        tTicket = 0; // 機台賣出的總票數
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        Random random = new Random();
        int sellTickets = random.nextInt(1, 5); // 這次賣出的票數
        while (getTicket(sellTickets) == true) {
            tTicket += sellTickets;
            // System.out.println(t.getName() + "賣出總票數:" + tTicket);
            System.out.println(t.getName() + "這次賣出" + sellTickets + "張票 => " + t.getName() + "已經賣出" + tTicket
                    + "張票 =>" + "還剩下" + ticket + "張票");
            sellTickets = random.nextInt(1, 5);
        }
        System.out.println(t.getName() + "總共賣出" + tTicket + "張票");
    }

    synchronized private static boolean getTicket(int num) {
        if (ticket >= num) {
            ticket -= num;
            return true;
        } else {
            return false;
        }
    }
}

public class hw3_0929 {
    public static void main(String[] args) {
        ticketClass tA = new ticketClass("A機台");
        ticketClass tB = new ticketClass("B機台");
        ticketClass tC = new ticketClass("C機台");
        ticketClass tD = new ticketClass("D機台");
    }
}
