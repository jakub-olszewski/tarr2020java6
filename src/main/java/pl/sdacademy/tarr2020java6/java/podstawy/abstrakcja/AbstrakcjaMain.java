package pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja;

import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.figury.Kolo;
import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.figury.Kwadrat;
import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.figury.Prostokat;
import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.figury.Trojkat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class AbstrakcjaMain {

    /**
     * Zadanie
     *
     */
        // Trojkat
        // Trojkat równoboczny
        // prostokąt
        // koło
        // wszystkie figury tworzymy w pakiecie abstrakcja/figury

        // klasa abstrakcyjna Figura w pakiecie abstrakcja

        // interfejs Obliczenia w pakiecie abstrakcja/interfejsy

        // interfejs Informacje w pakiecie abstrakcja/interfejsy

        /*
        Zadanie: Stwórz listę figur ,wypisz informacje
        zsumuj pola;
         */
    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(5);
        Kolo kolo = new Kolo(5);
        Prostokat prostokat = new Prostokat(2,3);

        // lista figur
        List<Figura> listaFigur = new ArrayList();
        // dodanie kwadratu do listy
        listaFigur.add(kwadrat);
        listaFigur.add(kolo);
        listaFigur.add(prostokat);

        // wypisanie informacji w pętli
        for(Figura element : listaFigur){
            element.wypiszInformacje();
        }

        Trojkat trojkat = new Trojkat(3,4,5);
        trojkat.wypiszInformacje();

    }
}
