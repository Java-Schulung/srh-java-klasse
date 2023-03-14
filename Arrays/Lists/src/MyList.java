import java.util.ArrayList;

public class MyList {
    /**
     * Vorgabe max. 30 Schueler
     */
    private String[] klassenList = new String[30];
    /**
     * Hilft uns das letzte Element in der Klassenliste zu indentifizieren
     */
    private int lastIndex = -1;

    public MyList() {
        this.klassenList[0] = "Yuriy";
    }

    public void add(String name) {

    }

    @Override
    public String toString(){
        String output = "";
        //formatting
        for(int i = 0; i < this.klassenList.length; i++) {
            String schueler = this.klassenList[i];
            if(schueler != null && !schueler.isBlank()) {
                output += schueler;
                if(i != this.klassenList.length) {
                    output += ", ";
                }
            }
        }
        return "[" + output + "]";
    }


    public static void main(String[] args) {
        System.out.println("Lists");
        ArrayList<Integer> firstList = new ArrayList<>();
        System.out.println(firstList.toString());
        System.out.println(firstList.size());
        System.out.println(firstList.isEmpty());

        ArrayList<Integer> secondList = null;
        System.out.println(secondList == null);
        if(secondList == null) {
            secondList = new ArrayList<>();
        }
        // nur hinzufügen, keine update
        secondList.add(23);                  //int[array.length] = 1;
        secondList.add(50);
        secondList.add(2, 1);  //int[10] = 1;
        System.out.println(secondList);
        secondList.add(1, -1);  //int[10] = 1;
        System.out.println(secondList);
        //update
        secondList.set(1, 666);
        System.out.println(secondList);
        //entferne nach index
        Integer removedObject = secondList.remove(1);
        System.out.println(removedObject);
        System.out.println(secondList);
        //entferne nach Value
        secondList.add(23);
        boolean isRemoved = secondList.remove(new Integer(23));
        System.out.println(isRemoved);
        System.out.println(secondList);
        //beinhaltet - contains
        boolean contains = secondList.contains(new Integer(1));
        System.out.println(String.valueOf(contains));
        contains = secondList.contains(new Integer(-1));
        System.out.println(contains);
        contains = secondList.contains(null);
        System.out.println(contains);
        //einen Eintrag auf null setzen
        secondList.set(0, null);
        System.out.println(secondList);
        System.out.println(secondList.contains(null));

        secondList.clear();
        System.out.println(secondList);
        //Listen vergleichen
        boolean isEqual = firstList.equals(secondList);
        System.out.println(isEqual);



        //String[]
        MyList klasse = new MyList();
        System.out.println(klasse);
        //Fügt einen Schueler zu der Klasse hinzu
        klasse.add("Yuriy");
        klasse.add("Marce");
        klasse.add("Pascal");
        klasse.add("Rafael");
        //....

        /*
        [Marcel, Pascal, Rafael, ...]
         */
        //Gibt uns die Liste der Schueler in Textform aus
        System.out.println(klasse);

        //Löscht einen Schueler raus anhand der ID
        String schuelerName = klasse.remove(0);
        System.out.println(schuelerName);

        //Entfern angegeben Schueler aus der Klasse
        boolean isRemoved = klasse.remove("Rafael");
        System.out.println(isRemoved);

        //Aktualisiert den Name der Schuler
        klasse.set(0, "Marcel");
        System.out.println(klasse);

        //Gibt die Anzahl der Schueler in der Klasse aus
        System.out.println(klasse.size());

        //Gibt true wenn der Schueler existiert, false wenn nicht
        System.out.println(klasse.contains("Pascal"));
        System.out.println(klasse.contains("Yuriy"));

        //löscht alle Schueler aus der Klasse
        klasse.clear();
        System.out.println(klasse);
    }

}