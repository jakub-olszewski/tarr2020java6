package pl.sdacademy.tarr2020java6.java.zaawansowana.wyjatki;

import pl.sdacademy.tarr2020java6.java.zaawansowana.narzedzia.Wypisz;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public class Main {

    public static void main(String[] args) throws Exception {
        {
            int liczbaGodzin = 2;
            Wypisz.tytul("Poprawna liczba godzin");
            int liczbaSekund = pobierzLiczbeSekund(liczbaGodzin);
            System.out.println(liczbaSekund);
        }
        {
            int liczbaGodzin = -2;
            Wypisz.tytul("Nie poprawna liczba godzin");
            int liczbaSekund = pobierzLiczbeSekund(liczbaGodzin);
            System.out.println(liczbaSekund);
        }
        {
            Wypisz.tytul("Zakończenie programu !!!");
        }

    }

    /**
     * Metoda wylicza liczbe sekund i zrzuca wyjątek w przypadku nie poprawnego argumentu
     * @param liczbaGodzin - liczba godzin
     * @return liczba sekund
     * @throws IllegalArgumentException nie prawidlowy argument < 0
     */
    private static int pobierzLiczbeSekund(int liczbaGodzin) throws IllegalArgumentException {
        if(liczbaGodzin < 0){
            // zrzucanie wyjątku
            throw new IllegalArgumentException("wprowadzona godzina '"+liczbaGodzin+"' musi być > 0 !");
        }
        return liczbaGodzin*60*60;
    }
}
