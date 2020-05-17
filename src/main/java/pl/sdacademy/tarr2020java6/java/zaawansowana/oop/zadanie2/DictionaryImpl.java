package pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie2;

import java.util.HashMap;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 17.05.2020
 **/
public class DictionaryImpl implements Dictionary {

    class WordData extends HashMap<String,String> {

        // konstruktor pod klasy
        public WordData(){
            super();// dlaczego tutaj jest super ?
        }
    }

    @Override
    public String search(String word) {
        return "";
    }

    // konstruktor nad klasy
    public DictionaryImpl(){
        WordData wordData = new WordData();
    }
}
