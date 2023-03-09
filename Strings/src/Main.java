import java.util.Arrays;

public class Main {
    public static int length = 0;
    public static void main(String[] args) {
        String literalString1 = null;
        String literalString2 = null;

        String objectString1 = new String("abc");
        String objectString2 = null;

        String text1 = "Guten Morgen Yuriy.";
        String text2 = "Wie geht es dir heute?";
        String text3 = " ";

        System.out.println(text1 + text3 + text2);

        String ganzerText = String.format("%s %s", text1, text2);
        System.out.println(ganzerText);

        String name = "Yuriy";
        String t1 = "Hallo, mein Name %s.\n";
        String concatText1 = String.format(t1, name);
        System.out.println(concatText1);

        int alter = 36;
        String t2 = "Ich bin %d.\n";
        String concatText2 = String.format(t2, alter);
        System.out.println(concatText2);

        int jahr = 2008;
        String t3 = "Ich habe %d angefangen zu studieren.\n";
        String concatText3 = String.format(t3, jahr);
        System.out.println(concatText3);

        //String newText = String.format("%s%s%s", concatText1, concatText2, concatText3);
        String newText = concatText1+concatText2+concatText3;
        System.out.println(newText);


        System.out.println(newText.isEmpty());

        String bla = "";
        System.out.println(bla.isEmpty());
        System.out.println(bla.isBlank());
        System.out.println("--------------");

        String bla2 = " ";
        System.out.println(bla2.length());
        System.out.println(bla2.isEmpty());
        System.out.println(bla2.isBlank());
        System.out.println("--------------");

        String blank = new String();
        System.out.println(blank.length());
        System.out.println(blank.isEmpty());
        System.out.println(blank.isBlank());
        System.out.println("--------------");

        String textMitNull = null;
        //System.out.println(textMitNull.length());   //NullPointerException
        System.out.println(blank.isBlank());
        System.out.println("--------------");
        //System.out.println(textMitNull.isEmpty());   //NullPointerException

        String textMitLeerzeichen = "    Hallo";
        System.out.println(textMitLeerzeichen);
        System.out.println(textMitLeerzeichen.trim());
        System.out.println(textMitLeerzeichen.isBlank());

        bla2 = " ";
        System.out.println(bla2.trim().isBlank());

        System.out.println(bla2.length());
        String v1 = "";
        String v2 = new String();
        System.out.println(v1.length());
        System.out.println(v2.length());
        //System.out.println(textMitNull.length());   //NullPointerException

        //SPLIT
        String meinTextZumSplitten = "Hallo, heute ist ein schöner Tag.";
        System.out.println(meinTextZumSplitten);

        System.out.println(Arrays.toString(meinTextZumSplitten.split(" ")));
        System.out.println(meinTextZumSplitten.split(" ").length);

        System.out.println(Arrays.toString(meinTextZumSplitten.split(", ")));

        System.out.println(Arrays.toString(meinTextZumSplitten.split("")));

        int l1 = meinTextZumSplitten.length();
        int l2 = meinTextZumSplitten.split("").length;

        System.out.println(meinTextZumSplitten.length());
        System.out.println(l1);
        System.out.println(l1);
        System.out.println(l1);
        System.out.println(l1);
        System.out.println(l1);

        System.out.println(l1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1 == l2);

        System.out.println(meinTextZumSplitten.length());
        System.out.println(meinTextZumSplitten.split("").length);
    }
}