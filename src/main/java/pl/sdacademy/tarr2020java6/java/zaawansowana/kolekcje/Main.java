package pl.sdacademy.tarr2020java6.java.zaawansowana.kolekcje;

import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.Figura;
import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.figury.Kolo;
import pl.sdacademy.tarr2020java6.java.podstawy.abstrakcja.figury.Kwadrat;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Elephant;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Lion;

import java.util.*;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public class Main {

    /**
     * Kolekcje
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Zadanie.
         *
         * 1.Podaj przyklady użyć poniższych kolekcji
         * Zaaragumentuj wybrane użycie
         *
         * 2. Co się stanie gdy usuniemy z kolejki ?
         *
         * 3.Czym się różni lista od zbioru ?
         *
         * Przykłady:
         * - struktura Ksiązek
         * - struktura Stacji paliw
         * - struktura słownika tłumaczeń
         * - struktura bazy ZUS ubezpieczonych
         * - struktura bazy PLUS telefonii
         * - struktura ogłoszeń na allegro
         * - struktura kody pocztowe
         * - struktura restauracji menu
         */

        // lista
        List list;
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Lion("Simba"));
        zoo.add(new Elephant("Dumbo"));

        // zbiór
        Set zbior;
        Set<Figura> zbiorFigur = new HashSet<>();
        zbiorFigur.add(new Kwadrat(4));
        zbiorFigur.add(new Kolo(4));

        // Map
        Map mapa;
        Map<Integer,String> mapaLiczb = new HashMap<>();
        mapaLiczb.put(1,"pierwszy");
        mapaLiczb.put(2,"drugi");

        // kolejka w kolejnosci dodawania
        Queue kolejka;
        Queue<String> kolejkaWBiedronce = new ArrayDeque<>();
        kolejkaWBiedronce.add("Janusz");
        kolejkaWBiedronce.add("Grażyna");


    }
}
