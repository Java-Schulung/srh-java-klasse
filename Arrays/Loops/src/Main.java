import java.util.Arrays;

public class Main {

    /*
    | Index | Buch | Titel | Jahr | Author |
    | 1 | Harry Potter | Stein der Weisen | 2000 |
    | 2 | Harry Potter | Kamer der Schreckens | 2001 |
    | 3 | Harry Potter | Der Gefangene von Askaban | 2003 |
     */
    public static String[][] removeEntry(String[][] bib, int index) {
        int tmpIndex = 0;
        String[][] bib2 = new String[bib.length-1][];
        for(int i = 0; i < bib.length; i++) {
            if(i != index-1) {
                String[] buch = bib[i];
                bib2[tmpIndex] = Arrays.copyOf(buch, buch.length);
                bib2[tmpIndex][0] = String.valueOf(tmpIndex+1);
                tmpIndex++;
            }
        }
        /*
        | Index | Buch | Titel | Jahr | Author |
        | 1 | Harry Potter | Stein der Weisen | 2000 |
        | 2 | Harry Potter | Der Gefangene von Askaban | 2003 |
        */
        return bib2;
    }

    public static String getDatabase(String[][] bibliothek) {
        String database = "| Index | Buch | Titel | Jahr | Author |";
        for (int i = 0; i < bibliothek.length; i++) {
            String cols = String.format("| %s | %s | %s | %s |", bibliothek[i]);
            database += "\n" + cols;
        }
        return database;
    }

    public static String getMDatabase(String[][] bibliothek) {
        String database = "| Index | Buch | Titel | Jahr | Author |";
        for (int i = 0; i < bibliothek.length; i++) {
            String zeile = "";
            for (int j = 0; j < bibliothek[i].length; j++) {
                zeile += "| " + bibliothek[i][j] + " ";
            }
            database += "\n" + zeile + "|";
        }

        return database;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int index2 = 0;
        String[][] bib = new String[3][5];
        //buch #1
        bib[0][0] = String.valueOf(++index2);
        bib[0][1] = "Harry Potter";
        bib[0][2] = "Stein der Weisen";
        bib[0][3] = "2000";
        bib[0][4] = "J. Rolling";
        String buch1 = String.format("| %s | %s | %s | %s |", bib[0]);

        //buch #2
        bib[1][0] = String.valueOf(++index2);
        bib[1][1] = "Harry Potter";
        bib[1][2] = "Kamer der Schreckens";
        bib[1][3] = "2001";
        bib[1][4] = "J. Rolling";
        String buch2 = String.format("| %s | %s | %s | %s |", bib[1]);

        //buch #3
        bib[2][0] = String.valueOf(++index2);
        bib[2][1] = "Harry Potter";
        bib[2][2] = "Der Gefangene von Askaban";
        bib[2][3] = "2003";
        bib[2][4] = "J. Rolling";
        String buch3 = String.format("| %s | %s | %s | %s |", bib[2]);

        String header = String.format("| Index | Buch | Titel | Jahr | Author |");
        System.out.println(header);
        System.out.println(buch1);
        System.out.println(buch2);
        System.out.println(buch3);

        System.out.println("===================================");
        System.out.println("WHILE");
        System.out.println("===================================");
        //while
        int index = 0;
        while(index <= 20) {
            if (index == 13) {
                index++;
                continue;
            }
            System.out.println(index);
            index++;
        }
        System.out.println("===================================");
        System.out.println("FOR");
        System.out.println("===================================");

        //for
        String database = "| Index | Buch | Titel | Jahr | Author |";
        for (int i = 0; i < bib.length; i++) {
            String cols = String.format("| %s | %s | %s | %s |", bib[i]);
            database += "\n" + cols;
        }
        System.out.println(database); //return database;

        //FOR FUNCTION
        System.out.println("===================================");
        System.out.println("FOR FUNCTION");
        System.out.println("===================================");
        String db = Main.getDatabase(bib);
        System.out.println(db);

        String mDB = Main.getMDatabase(bib);
        System.out.println(mDB);

        //Lösche ein Buch aus der Bibliothek
        System.out.println("===================================");
        System.out.println("Aufgabe");
        System.out.println("===================================");
        String[][] bib2 = Main.removeEntry(bib, 2);
        //for-each loop
        for(String[] buch : bib2) {
            System.out.println(Arrays.toString(buch));
        }

        for(float i : new int[]{1,435,4,46,56,57,8,68,68,68}) {
            System.out.println(i);
        }
    }
}