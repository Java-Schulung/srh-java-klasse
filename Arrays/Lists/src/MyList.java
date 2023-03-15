import java.util.ArrayList;
import java.util.Arrays;

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
        //this.klassenList[0] = "Yuriy";
    }

    /**
     *
     * @param name String Name des Schueler der geloescht werden soll
     */
    public void add(String name) {
        System.out.println("add()");
        if (this.lastIndex > this.klassenList.length) {
            this.lastIndex++;
            this.klassenList[this.lastIndex] = name;
        }
    }

    /**
     * Aktualisiert den Namen eines Schuelers, der bereits vorhanden ist.
     * @param index int - ID des Schuelers
     * @param name String - Name des Schulers
     * @return boolean - true: wenn der Schueler gefunde und aktualisiert wurde,
     * false: wenn der Schueler nicht gefunden wurde und wenn der index nicht stimmt
     */
    private boolean set(int index, String name) {
        System.out.println("set()");
        if (index > this.lastIndex) {
            return false;
        }
        String updateName = this.klassenList[index];
        if (updateName != null) {
            this.klassenList[index] = name;
            return true;
        }
        return false;
    }

    /**
     * Löscht einen Schuler anhand seiner ID
     * @param index int value - id des Schuelers
     * @return String - der Name des gelöschten Schuelers
     */
    private String remove(int index) {
        System.out.println("remove(int)");
        if (index > 0 && index > this.lastIndex) {
            return null;
        }

        String name = null;
        int tmpIndex = 0;
        String[] cloneList = new String[30];

        if (this.klassenList[index] != null) {
            name = this.klassenList[index];
            for (String schueler : this.klassenList) {
                if (schueler != null && !schueler.isBlank()) {
                    cloneList[tmpIndex] = schueler;
                    tmpIndex++;
                }
            }
            this.lastIndex = tmpIndex;
            this.klassenList = cloneList;
        }

        return name;
    }

    public boolean remove(String name) {
        System.out.println("remove(String)");
        return false;
    }

    private void clear() {
        System.out.println("clear()");
        this.klassenList = new String[30];
        this.lastIndex = -1;
    }

    private boolean contains(String searchingName) {
        System.out.println("contains()");
        if (searchingName != null && !searchingName.isBlank()) {
            for (String name : this.klassenList) {
                if (name == null) {
                    continue;
                }
                if (searchingName.equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Gibt die Anzahl der angemeldeten Schueler in einer Klasse aus
     * @return int value - Anzahl der Schueler
     */
    private int size() {
        System.out.println("size()");
        return this.lastIndex + 1;
        /*
        int anzahl = 0;
        for(String name : this.klassenList) {
            if (name != null && !name.isBlank()) {
                anzahl++;
            }
        }
        return anzahl;
        */
    }

    @Override
    public String toString() {
        System.out.println("toString()");
        String output = "";
        //formatting
        for(int i = 0; i < this.klassenList.length; i++) {
            String schueler = this.klassenList[i];
            if(schueler != null && !schueler.isBlank()) {
                //Yuriy,Marcel,Steffen
                output += schueler;
                // output = output + schueler;
                if(this.klassenList[i+1] != null) {
                    output += ", ";
                }
            }
        }
        return "[" + output + "]";
    }

    public static void main(String[] args) {
        //MyList.testLists();
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
        System.out.println(klasse); //done

        //Löscht einen Schueler raus anhand der ID
        String schuelerName = klasse.remove(0);
        System.out.println(schuelerName);

        //Entfern angegeben Schueler aus der Klasse
        boolean isRemoved = klasse.remove("Rafael");
        System.out.println(isRemoved);

        //Aktualisiert Name des Schuelers
        boolean isUpdated = klasse.set(0, "Marcel");
        System.out.println(isUpdated);
        System.out.println(klasse);

        //Gibt die Anzahl der Schueler in der Klasse aus
        System.out.println(klasse.size());  //done

        //Gibt true wenn der Schueler existiert, false wenn nicht
        System.out.println(klasse.contains("Pascal"));
        System.out.println(klasse.contains("Yuriy"));
        System.out.println(klasse.contains(""));
        System.out.println(klasse.contains(null));

        //löscht alle Schueler aus der Klasse
        klasse.clear();
        System.out.println(klasse);
    }

    public static void testLists() {
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
    }
}