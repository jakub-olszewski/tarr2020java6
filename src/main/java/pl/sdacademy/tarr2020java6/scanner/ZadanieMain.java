package pl.sdacademy.tarr2020java6.scanner;

import pl.sdacademy.tarr2020java6.klasy.User;

import java.util.Scanner;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class ZadanieMain {

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        // tworzymy skanner in -> wejście

        System.out.println("======================================");
        System.out.println("==== System Tworzenia Użytkownika ====");
        System.out.println("======================================");

        // powyższe wczytywanie z użyciem pętli line

        // wczytywanie imie
        System.out.println("Podaj imię:");
        String wczytanieImie = skaner.nextLine();

        // wczytanie nazwiska

        // wczytanie wieku
        // nextInt()

        // wyświetlenie utworzono użytkownika imię i nazwisko
        // ustawiamy wczytane wartości do zmiennych
        String imie = wczytanieImie;
        String nazwisko = "nazwisko";
        int wiek = 0;
        // utworzymy użytkownika
        System.out.println("======================================");
        User uzytkownik = new User(imie,nazwisko,wiek);
        System.out.println("INFO: Utworzono użytkownika!");
        // wypiszemy z użyciem toString()
        System.out.println(">>> "+uzytkownik);

    }
}
