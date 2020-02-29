package pl.sdacademy.tarr2020java6.dataiczas;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

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
        String dataJakoNapis = "2020-02-29 11:55";
        String formatDaty = "yyyy-MM-dd HH:mm";

        // tworzymy formater potrzebny do parsowania daty
        // musimy wiedzieć w jakim formacie jest data którą formatujemy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDaty);
        // powstała data poniżej w wyniku parsowania dataJakoNapis
        LocalDateTime data = LocalDateTime.parse(dataJakoNapis,formatter);


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
