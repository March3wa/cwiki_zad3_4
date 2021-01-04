package Ć9_Z3;

import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader(new File("maci.txt")));
        double tab[][] = new double[3][4];
        for (int i = 0; i < tab.length; i++) {
            String [] elements = bReader.readLine().split("\\s");
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = Double.parseDouble(elements[j+1]);
                //tab[i][j] = (char)bReader.read();
            }
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%8.3f", tab[i][j]);
            }
            System.out.println();
        }
    }
}
