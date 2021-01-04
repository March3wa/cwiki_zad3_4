package Ć9_Z3;

import java.io.*;
import java.util.Random;

public class Main {

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
    public double srednia(double [][]tab){
        double suma = 0;
        int liczbaWyrazow = liczbaKolumn()*liczbaWierszy();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                suma+=tab[i][j];
            }
        }
        return suma/liczbaWyrazow;
    }
//    public String toString(){
//        return "Macierz\n"+"liczba wierszy: "+ liczbaWierszy()+"\n"+"liczba kolumn: "+liczbaKolumn()+"\n";
//    }
//    public void wyswietl(){
//        System.out.println(toString());
//        wyswietlaczTablicy();
//    }

    public static void main(String[] args) {
        Main main = new Main();
        main.generatorTablicy();


        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File("macierz.txt")));BufferedReader breader2 = new BufferedReader(new FileReader(new File("macierz.txt")))) {
            printWriter.println("Macierz");
            printWriter.println(tab.length);
            printWriter.println(tab[0].length);
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[0].length; j++) {
                    printWriter.printf("%7.3f", tab[i][j]);
                }
                printWriter.println();
            }
            printWriter.flush();
            breader2.readLine();
            double [][]tab2 = new double[Integer.parseInt(breader2.readLine())][Integer.parseInt(breader2.readLine())];
            for (int i = 0; i < tab2.length; i++) {
                String [] elements = breader2.readLine().split("\\s+");
                for (int j = 0; j < tab2[i].length; j++) {
                    tab2[i][j]=Double.parseDouble(elements[j+1]);
                }
            }
            main.wyswietlaczTablicy(tab2);
            System.out.println(main.srednia(tab2));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}