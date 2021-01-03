package Ć8;

abstract public class Pracownik {

    String nazwisko;
    float czescEtatu;

    Pracownik(String n, float czE){
        nazwisko = n;
        czescEtatu = czE;
    }
    abstract double wyplata();
    public abstract String toString();
    String getNazwisko(){
        return nazwisko;
    }
    float getCzescEtatu(){
        return czescEtatu;
    }
    void setCzescEtatu(float czescEtatu){
        this.czescEtatu = czescEtatu;
    }


}
