package pl.sdacademy.tarr2020java6.zadania.zadanie1;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 16.02.2020
 **/
public class Zamowienie {

    int numer;
    float cena;

    public Zamowienie(int wprowadzonyNumer,float wprowadzonaCena){
        numer = wprowadzonyNumer;
        cena = wprowadzonaCena;
    }

    public float pobierzCena(){
        return cena;
    }


}
