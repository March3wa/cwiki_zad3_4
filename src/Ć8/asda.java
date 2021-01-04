package Ć8;

import java.io.*;
import java.util.Random;

public class asda {
    public static void main(String[] args) throws IOException {

        double[][] tab = new double[3][4];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextDouble() * 20 - 10;
            }
        }
    DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("macierzbin.dat"))));
    double[][] tab2 = new double[dis.readInt()][dis.readInt()];
            for (int i = 0; i < tab2.length; i++) {
        for (int j = 0; j < tab2[i].length; j++) {
            tab[i][j] = dis.readDouble();
        }
    }
            System.out.println("tablica");
            for (int i = 0; i < tab2.length; i++) {
        for (int j = 0; j < tab2[i].length; j++) {
            System.out.printf("%8.3f", tab2);
        }
    }
}}
