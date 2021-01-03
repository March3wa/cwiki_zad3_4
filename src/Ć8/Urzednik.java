package Ć8;

public class Urzednik extends Pracownik {

    int placaPodstawowaUrzednika = 3000;
    float bonus = 1.2f;

    Urzednik(String nn, float czE){
        super(nn, czE);
    }
    double wyplata(){
        if(getCzescEtatu()>1){
            return placaPodstawowaUrzednika+(bonus*((getCzescEtatu()-1)*placaPodstawowaUrzednika));
        }
        else return placaPodstawowaUrzednika*getCzescEtatu();
    }
    public String toString(){
        return nazwisko+ " zarabia " + wyplata()+ "zł.";
    }
}
