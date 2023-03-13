import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String w1 = "Hallo";
        System.out.println(w1);

        char[] word = new char[5];
        word[0] = 'H';
        word[1] = 'a';
        word[2] = 'l';
        word[3] = 'l';
        word[4] = 'o';
        System.out.println(word);
        System.out.println(word.toString());    //hier kommt nur Speicherreferenz raus

        char[] w2 = w1.toCharArray();
        System.out.println(w2);

        String[] words = new String[3];
        words[0] = "Hello";
        words[1] = ", ";
        words[2] = "world";
        System.out.println(words);
        System.out.println(Arrays.toString(words));

        int[] zahlen = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(zahlen));

        int[]  falsch = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(falsch));

        String[] texte = {"text 1", "text2"};
        System.out.println(Arrays.toString(texte));

        //Exception
        boolean[] bools = {true, false, false, true};
        //ArrayIndexOutOfBoundsException
        //System.out.println(bools[5]);
        System.out.println(bools.length);
        System.out.println(bools[bools.length-1]);


        //-----------------------------------------
        String[] vieleWorte = null;
        vieleWorte = new  String[3];
        vieleWorte[0] = "Hallo";
        System.out.println(vieleWorte[0]);
        System.out.println(vieleWorte[1]);
        //-----------------------------------------
        vieleWorte[0] = "Hi";
        System.out.println(vieleWorte[0]);
        vieleWorte[0] = null;
        System.out.println(vieleWorte[0]);

        //-----------------------------------------
        double[] numbers = null;
        ///
        if (numbers == null) {
            numbers = new double[3];
        }
        numbers[0] = 2.2;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        //-----------------------------------------
        Double[] numberObj = new Double[3];
        numberObj[1] = 2.2;
        System.out.println(numberObj[1]);
        System.out.println(numberObj[0]);

        Main main = new Main();
        Main[] mainArray = new Main[3];

        //-----------------------------------------
        Main.myToString(new String[]{"Es", "ist", "Pausenzeit"});
        //-----------------------------------------
        String[] par = new String[]{"Es", "ist", "Pausenzeit"};
        Main.myToString(par);

        String[] bibliothek = new String[5];
        bibliothek[0] = "Buch 1";
        bibliothek[1] = "Buch 2";
        bibliothek[2] = "Buch 3";
        bibliothek[3] = "Buch 4";
        //nach 1 Monat
        bibliothek[4] = "Buch 5";
        System.out.println(Arrays.toString(bibliothek));
        //+ 1 Monat
        String[] bibliothek2 = new String[6];
        bibliothek2[0] = bibliothek[0];
        bibliothek2[1] = bibliothek[1];
        bibliothek2[2] = bibliothek[2];
        bibliothek2[3] = bibliothek[3];
        bibliothek2[4] = bibliothek[4];
        bibliothek2[5] = null;
        System.out.println("bibliothek2: "+Arrays.toString(bibliothek2));

        //Copy
        String[] bibliothek3 = bibliothek2;
        System.out.println("bibliothek3: "+Arrays.toString(bibliothek3));

        bibliothek2[2] = "Buch ist verscholen";
        bibliothek3[4] = "Buch ist verscholen";
        System.out.println("bibliothek3: "+Arrays.toString(bibliothek3));
        System.out.println("bibliothek2: "+Arrays.toString(bibliothek2));
        System.out.println("=========================================");
        System.out.println(bibliothek2);
        System.out.println(bibliothek3);
        System.out.println(bibliothek2.equals(bibliothek3));
        System.out.println("=========================================");
        //neues Buch
        bibliothek3[5] = "Harry Poter";
        System.out.println("bibliothek3: "+Arrays.toString(bibliothek3));
        System.out.println("bibliothek2: "+Arrays.toString(bibliothek2));
        System.out.println("=========================================");
        //clone
        String[] bibliothek4 = Arrays.copyOf(bibliothek3, 10);
        System.out.println("bibliothek4: "+Arrays.toString(bibliothek4));
        bibliothek3[0] = "Meteor";
        System.out.println("=========================================");
        System.out.println("bibliothek4: "+Arrays.toString(bibliothek4));
        System.out.println("bibliothek3: "+Arrays.toString(bibliothek3));
        System.out.println("bibliothek2: "+Arrays.toString(bibliothek2));
        System.out.println(bibliothek3.equals(bibliothek4));


        //SORT
        System.out.println("=========================================");
        System.out.println("=========================================");
        int[] sortiere = new int[]{10, 20,3, 99, 44, 4,1,0 ,-1000};
        Arrays.sort(sortiere);
        System.out.println(Arrays.toString(sortiere));
        char[] sortiereChars = new char[]{'b', 'c','z','a','y'};
        Arrays.sort(sortiereChars);
        System.out.println(Arrays.toString(sortiereChars));
        String text = "Buch ist verscholen";
        char[] textArray = text.toCharArray();
        Arrays.sort(textArray);
        System.out.println(textArray);
        System.out.println("=========================================");
        System.out.println((int)'B');
        System.out.println((int)'b');
        System.out.println((int)' ');
        System.out.println((int)'-');

        //Sortiere selber
        int[] sortiereSelber = {3, 10, 5, 1};
        System.out.println(Arrays.toString(sortiereSelber));
        int[] sortiert = new int[sortiereSelber.length];
        sortiert[0] = sortiereSelber[3];
        sortiert[1] = sortiereSelber[0];
        sortiert[2] = sortiereSelber[2];
        sortiert[3] = sortiereSelber[1];
        System.out.println(Arrays.toString(sortiert));
        //Fun Frage
        sortiereSelber[1] = 666;
        System.out.println(Arrays.toString(sortiereSelber));
        System.out.println(Arrays.toString(sortiert));

        String t1 = new String("blabla");
        String t2 = t1;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.equals(t2));
        t2 = "hello";
        System.out.println(t1);
        System.out.println(t2);
        String t3 = new String(t1.toCharArray());
        System.out.println(t1.equals(t3));
        System.out.println(t1);
        System.out.println(t3);

        System.out.println(t1.hashCode());
        System.out.println(t3.hashCode());

        //double array - Zweidimensionales Array
        Integer[][] doubleArray = new Integer[4][5];
        /*
       0 1   1   1   1   1
       1 2   2   2   2   2
       2 3   3   3   3   3
       3 4   4   4   4   4
        */
        doubleArray[1][3] = new Long(100000000000000000L).intValue();
        System.out.println(doubleArray[1][3]);
        System.out.println(doubleArray[3][3]);

        Integer z1 = 1;
        Integer z2 = 1;
        System.out.println(z1 == z2);
        System.out.println(z1.intValue() == z2.intValue());
        System.out.println(doubleArray[1][3]);
        System.out.println(doubleArray[1][3].doubleValue());
        System.out.println(doubleArray[1][3].longValue());
        System.out.println(doubleArray[1][3] == 666);

        int index = 0;
        String[][] bib = new String[3][5];
        //buch #1
        bib[0][0] = String.valueOf(++index);
        bib[0][1] = "Harry Potter";
        bib[0][2] = "Stein der Weisen";
        bib[0][3] = "2000";
        bib[0][4] = "J. Rolling";
        String buch1 = String.format("| %s | %s | %s | %s |", bib[0]);

        //buch #2
        bib[1][0] = String.valueOf(++index);
        bib[1][1] = "Harry Potter";
        bib[1][2] = "Kamer der Schreckens";
        bib[1][3] = "2001";
        bib[1][4] = "J. Rolling";
        String buch2 = String.format("| %s | %s | %s | %s |", bib[1]);

        //buch #3
        bib[2][0] = String.valueOf(++index);
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
    }

    /**
     * Die Funktion gibt in die Konsole Text wie folgt aus - [Hello, , , world]
     * @param words String array should contains max 3 Strings
     */
    public static void myToString(String[] words){
        //Option #1
        System.out.println("[" + words[0] + ", " + words[1] + ", " + words[2] + "]");
        //Option #2
        String ausgabe = String.format("[%s, %s, %s]", words[0], words[1], words[2]);
        System.out.println(ausgabe);
        //Option #2a
        String ausgabe2 = String.format("[%s, %s, %s]", words);
        System.out.println(ausgabe2);
        //Option #3
        System.out.println(Arrays.toString(words));
    }
}