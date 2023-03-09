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