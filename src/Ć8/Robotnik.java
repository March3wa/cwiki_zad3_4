package Ć8;

public class Robotnik extends Pracownik{

    int limit = 160;
    int stawkaGodzinowa = 18;

    Robotnik(String n, float czEt){
        super(n ,czEt);
    }
    double wyplata(){
        if(getCzescEtatu()>1){
            return limit*stawkaGodzinowa+(0.5*stawkaGodzinowa*((getCzescEtatu()-1)*limit));
        }
        else return getCzescEtatu()*limit*stawkaGodzinowa;
    }
    public String toString(){
        return nazwisko+ " zarabia " + wyplata()+ "zł.";
    }
}
