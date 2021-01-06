package Ć12_Z3;

public class WyrazILiczba {

    private String wyraz;
    private int liczbaWystapien;

    WyrazILiczba(String wyraz, int liczbaWystapien){
        this.wyraz = wyraz;
        this.liczbaWystapien = liczbaWystapien;
    }

    public String getWyraz() {
        return wyraz;
    }
    public int getLiczbaWystapien() {
        return liczbaWystapien;
    }
    public String toString(){
        return wyraz + " " + liczbaWystapien;
    }
}
