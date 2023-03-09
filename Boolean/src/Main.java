public class Main {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 100;
        int i3 = 10;

        System.out.println(i1 == i2);       //false
        System.out.println(i1 != i2);       //true
        System.out.println(i1 < i2);        //true
        System.out.println(i1 > i2);        //false
        System.out.println(i1 <= i2);       //true
        System.out.println(i1 >= i2);       //false
        System.out.println(i1 >= i3);       //true
        System.out.println(String.valueOf("test").isBlank());
    }
}