package pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie2;

import java.util.HashMap;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 **/
public class DictionaryImpl implements Dictionary {

    private final WordData wordData;

    /**
     * Klasa wewnętrzna zawierająca dane do słownika
     */
    class WordData extends HashMap<String,String> {

        // konstruktor pod klasy
        public WordData(){
            super();// dlaczego tutaj jest super ?
            put("window","okno");
            put("english","angielski");
        }
    }

    @Override
    public String search(String word) {
        return wordData.get(word.toLowerCase());
    }

    // konstruktor nad klasy
    public DictionaryImpl(){
        wordData = new WordData();
    }
}
