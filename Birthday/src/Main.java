public class Main {

    static int meinJahr = 1986;

    public static void binIchAelter(int nachbarJahr) {
        System.out.println(meinJahr < nachbarJahr);
    }

    /**
     * prüfe mit && Operator ob ich älter bin als meine zwei Nachbarn
     * @param linkerNachbar
     * @param rechterNachbar
     */
    public static void binIchAelterAlsMeineNachbarn(int linkerNachbar, int rechterNachbar) {
        System.out.println(!(linkerNachbar > meinJahr) && rechterNachbar > meinJahr);
    }
    public static void binIchAelterAlsEinerVonMeinenNachbarn(int linkerNachbar, int rechterNachbar) {
        System.out.println(!(linkerNachbar > meinJahr) || rechterNachbar > meinJahr);
    }

    public static void main(String[] args) {
        Main.binIchAelter(2000);
        System.out.println();
        //&& 1986
        Main.binIchAelterAlsMeineNachbarn(2000, 1999);  //true
        Main.binIchAelterAlsMeineNachbarn(2000, 1980);  //false
        Main.binIchAelterAlsMeineNachbarn(1900, 1980);  //false
        Main.binIchAelterAlsMeineNachbarn(2000 /*false*/, 1987 /*true*/);  //false
        System.out.println();
        //|| 1986
        Main.binIchAelterAlsEinerVonMeinenNachbarn(2000, 1990);  //true
        Main.binIchAelterAlsEinerVonMeinenNachbarn(2000, 1980);  //true
        Main.binIchAelterAlsEinerVonMeinenNachbarn(1900, 1980);  //false
        Main.binIchAelterAlsEinerVonMeinenNachbarn(2000, 1987);  //false
    }
}