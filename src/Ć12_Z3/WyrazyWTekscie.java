package Ć12_Z3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WyrazyWTekscie {

    static ArrayList <String> wyrazy = new ArrayList<>();
    Set<String> wyrazyBezPowtorzen;

    public static void main(String[] args) {
        new WyrazyWTekscie().start();

    }
    class ComparatorIlosciowy implements Comparator<WyrazILiczba> {
        public int compare(WyrazILiczba o1, WyrazILiczba o2) {
            return -1 * (o1.getLiczbaWystapien() - o2.getLiczbaWystapien());
        }
    }
    class ComparatorAlfabetyczny implements Comparator<WyrazILiczba> {
        public int compare(WyrazILiczba o1, WyrazILiczba o2) {
            return o1.getWyraz().compareTo(o2.getWyraz());
        }
    }
    void start(){
        try (BufferedReader breader = new BufferedReader(new FileReader(new File("piosenka.txt")))){
            String line= null;
            while((line = breader.readLine())!=null){
                przygotuj(line);
            }
            obliczenia();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void przygotuj(String s){
        String [] elements = s.split("[ !-]");
        for (int i = 0; i < elements.length; i++) {
            wyrazy.add(elements[i]);
        }
    }

    void obliczenia(){
        System.out.println("liczba wszystkich wyrazów: " + liczbaWszystkichWyrazow());
        System.out.println("liczba wyrazów bez powtórzeń: " + liczbaWyrazowBezPowtorzen());
        liczbaWystapien();
    }
    int liczbaWszystkichWyrazow(){
       return wyrazy.size();
    }
    int liczbaWyrazowBezPowtorzen(){
        wyrazyBezPowtorzen = new HashSet<>(wyrazy);
        return wyrazyBezPowtorzen.size();
    }
    void liczbaWystapien(){
        liczbaWystapienAlfabetycznie();
        liczbaWystapienIlosciowo();
    }
    void liczbaWystapienAlfabetycznie(){
        Map<String, Integer> map = new HashMap<>();
        for (String wyraz : wyrazy) {
            Integer count = map.get(wyraz);
            if (count == null) {
                count = 0;
            }
            map.put(wyraz, count + 1);
        }
        ArrayList<WyrazILiczba> tablicaWyrazowILiczb = new ArrayList<>();
        for (String s : map.keySet()) {
            tablicaWyrazowILiczb.add(new WyrazILiczba(s.toLowerCase(), map.get(s)));
        }
        Collections.sort(tablicaWyrazowILiczb, new ComparatorAlfabetyczny());
        System.out.println(tablicaWyrazowILiczb);

    }
    void liczbaWystapienIlosciowo(){
        Map<String, Integer> map2 = new HashMap<>();
        for (String wyraz : wyrazy) {
            Integer count = map2.get(wyraz);
            if (count == null) {
                count = 0;
            }
            map2.put(wyraz, count + 1);
        }
        ArrayList<WyrazILiczba> tablicaWyrazowILiczb = new ArrayList<>();
        for (String s : map2.keySet()) {
            tablicaWyrazowILiczb.add(new WyrazILiczba(s, map2.get(s)));
        }
        Collections.sort(tablicaWyrazowILiczb, new ComparatorIlosciowy());
        for (int i = 0; i < tablicaWyrazowILiczb.size(); i++) {
            System.out.printf(tablicaWyrazowILiczb.get(i)+"\n");

        }


    }
}
