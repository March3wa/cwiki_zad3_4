package Ć9_Z1;

import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scn1 = null;
        Scanner scn2 = null;
        String wiersz_tekstu = null;

        try {
            scn1 = new Scanner(new InputStreamReader(System.in));
            scn2 = new Scanner(new InputStreamReader(System.in));

            System.out.println("Wprowadź nazwę pliku: ");
            BufferedReader br1 = new BufferedReader(new FileReader(scn1.next()));
            System.out.println("Przekopiuj zawartość do pliku: ");
            FileWriter f1 = new FileWriter(scn2.next(), true);
            String wiersz_tekstu1=null;
            while ((wiersz_tekstu = br1.readLine()) != null) {
                System.out.println(br1.readLine());
                wiersz_tekstu1+=br1.readLine()+"\n";
            }
            System.out.println(wiersz_tekstu1);
            Scanner sc3 = new Scanner(wiersz_tekstu1);
            //while(sc3.hasNext()){
                f1.write(wiersz_tekstu1);
            //}
            br1.close();
            //bw1.close();
            f1.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
