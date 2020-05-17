package pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie2;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 16.05.2020
 **/
public class Main {

    /**
     *
     * Zadanie2
     *
     * Program słownik. Dane wejsciowe w postaci Map (Collection) klucz/wartość.
     * Słownik ma możliwość wyszukiwania słowa. (Użycie for lub get())
     * Wyszukiwanie poprzez przeglądanie w pętli mapy słów
     *
     * Klasa WordData ma być klasą wewnętrzną klasy Dictionary
     * w klasie Main przykład użycia
     *
     * Klasy:
     * DictionaryImpl - implementacja interfejsu
     * Dictionary - interfejs słownik, zawiera WordData implementuje Search
     * WordData - dane do słownika extends Map
     * Search - interfejs
     *
     *      Metody:
     *          search(String word) - szuka dokladnie takie slowo
     *
     *      dodatkowe:
     *          searchStarts(String startWord) - szuka slowo rozpoczynajace sie
     *          searchContain(String partWord) - szuka części słowa
     *
     * Main - przykład użycia
     *
     *      Dictionary dictionary = new DictionaryImpl();
     *      String word = dictionary.search("Window");
     *      System.out.println(word);
     *      // w konsoli
     *      // Okno
     *
     * Dodatkowo:
     * 1)
     * import słów z pliku csv
     * Przykład:
     * ---
     * Mammal,Ssak;
     * Plant,Roślina;
     * ---
     * 1a)
     * 2)
     * pobieranie z klawiatury słowa (Scanner - java-podstawy)
     */
}
