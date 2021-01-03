package Ć8;

public class Main {
    public static void main(String[] args) {

        Pracownik p1 = new Urzednik("Kowalski", 0.9f);
        Pracownik p2 = new Robotnik("Nowak", 1.15f);
        System.out.println(p1.wyplata());
        System.out.println(p2.wyplata());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
