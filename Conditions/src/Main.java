import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sollNichtNullSein = " ";
        String sollNullSein = null;

        if (sollNichtNullSein != null) {
            System.out.println("ok");

            if (sollNichtNullSein.length() == 0) {
                System.out.println("Text ist leer");
            }

            if (sollNichtNullSein.isEmpty()) {
                System.out.println("Text ist leer");
            }

            if (sollNichtNullSein.isBlank()) {
                System.out.println("Text ist leer");
            }

            if (sollNichtNullSein == "") {
                System.out.println("Text ist leer");
            }

            if (sollNichtNullSein.equals("")) {
                System.out.println("Text ist leer");
            }
        }

        if (sollNullSein == null || sollNullSein.isEmpty()) {
            System.out.println("ist NULL");
        }

        if (sollNullSein == null) {
            System.out.println("ist NULL");
        }

        if (sollNullSein != null) {
            System.out.println("darf gar nicht eintreten");
        } else {
            System.out.println("ist NULL");
        }

        /*
            Geben 21 Jahrhundert aus wenn das vorgegebene Jahr größer ist als 2000
         */
        int jahr = 2022;
        //21 ab 2000
        if (jahr >= 2000) {
            System.out.println("wir sind in 21");
        } else {
            System.out.println("wir sind nicht in 21");
        }

        String s1 = "wir sind in 21";
        String s2 = "wir sind in 20";
        String s3 = s2;
        if (jahr >= 2000) {
            s3 = s1;
        }
        System.out.println(s3);
    }
}