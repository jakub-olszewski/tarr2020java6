package pl.sdacademy.tarr2020java6.zadania.zadanie1;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 16.02.2020
 **/
public class Zadanie1Main {

    // psvm
    public static void main(String[] args) {

        // tutaj tworzymy zamówienie i wypisujemy cene
        Zamowienie zamowienie1 = new Zamowienie(1,12.99f);
        // wypisanie ceny
        System.out.println(zamowienie1.pobierzCena());

    }
}
