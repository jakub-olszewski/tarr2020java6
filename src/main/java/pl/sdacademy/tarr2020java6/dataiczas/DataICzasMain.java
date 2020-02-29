package pl.sdacademy.tarr2020java6.dataiczas;

import java.time.LocalDateTime;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 29.02.2020
 **/
public class DataICzasMain {

    public static void main(String[] args) {

        // przykład użycia daty i czas
        LocalDateTime dataICzas = LocalDateTime.now();
        dataICzas.plusDays(3);
        System.out.println(dataICzas);

        String napisDataICzas = "2020-02-29 11:46";
        napisDataICzas += 3;
        System.out.println(napisDataICzas);

        // konwersja napisu na datę


        // konwersja daty na napis
    }

    /**
     * Zadanie implementacja metod na podstawie slajdu
     */


    public static LocalDateTime konwersjaNapisNaDate(String dataJakoNapis){
        //implementacja
        return null;
    }

    public static String konwersjaDataNaNapis(LocalDateTime data){
        //implementacja
        return null;
    }
}
