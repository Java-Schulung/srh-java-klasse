public class Main {

    /**
     * Ticket Nummer
     */
    static int ticketNumber = 1000;

    /**
     * zähle die Ticket Nummer hoch +1
     * gib die Nummer mit System.out.println aus
     * @return kein Wert
     */
    public static void ticketZiehen() {
        System.out.println("B-" + ticketNumber++);
    }

    public static void main(String[] args) {
        Main.ticketZiehen();    //1
        Main.ticketZiehen();    //2
        Main.ticketZiehen();    //3
        Main.ticketZiehen();    //4
        Main.ticketZiehen();    //5
        Main.ticketZiehen();    //6
        Main.ticketZiehen();    //7
    }
}