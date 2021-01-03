package Ć9_Z1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileWriter pisarz = null;
        Scanner scn1 = null;
        Scanner scn2 = null;
        try {
            scn1 = new Scanner(new InputStreamReader(System.in));
            scn2 = new Scanner(new InputStreamReader(System.in));
            System.out.println("Plik do wprowadzenia danych: ");
            pisarz = new FileWriter(scn1.next(), true);
            System.out.println("Wprowadź dane: ");
            while(!scn2.hasNext("koniec")) {
                pisarz.write(scn2.nextLine()+"\n");
            }
            } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pisarz.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
