package pl.sdacademy.tarr2020java6.scanner;

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
        // z użyciem pętli
        System.out.println("==== System Tworzenia Użytkownika ====");
        System.out.println("======================================");

        // powyższe wczytywanie z użyciem pętli line

        // wczytywanie imie
        String wczytanaLinia = skaner.nextLine();
        System.out.println(wczytanaLinia);

        // wczytanie nazwiska


    }
}
