package Ć9_Z3;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class ZapisBajtowy {
    public static double[][] tab;

    public int liczbaWierszy() {
        return tab.length;
    }

    public int liczbaKolumn() {
        return tab[0].length;
    }

    public void generatorTablicy() {
        tab = new double[3][4];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextDouble() * 20 - 10;
            }
        }
    }

    public void wyswietlaczTablicy(double[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%7.3f", tab[i][j]);
            }
            System.out.printf("%n");
        }
    }

    public double srednia(double[][] tab) {
        double suma = 0;
        int liczbaWyrazow = liczbaKolumn() * liczbaWierszy();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                suma += tab[i][j];
            }
        }
        return suma / liczbaWyrazow;
    }

    public static void main(String[] args) throws IOException {

        ZapisBajtowy zb = new ZapisBajtowy();
        zb.generatorTablicy();
        zb.wyswietlaczTablicy(tab);

        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("macierzbin.dat"))))) {
            dos.writeInt(tab.length);
            dos.writeInt(tab[0].length);
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[0].length; j++) {
                    dos.writeDouble(tab[i][j]);
                }
            }
            dos.flush();
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("macierzbin.dat"))));
            double[][] tab2 = new double[dis.readInt()][dis.readInt()];
            for (int i = 0; i < tab2.length; i++) {
                for (int j = 0; j < tab2[i].length; j++) {
                    tab2[i][j] = dis.readDouble();
                }
            }
            System.out.println("tablica");
            for (int i = 0; i < tab2.length; i++) {
                for (int j = 0; j < tab2[i].length; j++) {
                    System.out.printf("%8.5s",String.valueOf(tab2[i][j]));
                }
                System.out.println();
            }
        }
    }
}