package pl.sdacademy.tarr2020java6.tablice;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 29.02.2020
 **/
public class TabliceMain {

    public static void main(String[] args) {

        /*
        Zadanie1 tablica liczb dziesiętnych
        */
        int tablicaLiczb[] = new int[3];
        tablicaLiczb[0] = 20; // pierwszy element tablicy
        tablicaLiczb[1] = 19; // drugi element tablicy
        tablicaLiczb[2] = 18;
//        tablicaLiczb[3] = 17; // poza tablicą

        System.out.println("wielkosc tablicy:"+tablicaLiczb.length);
        System.out.println("element 2 :"+tablicaLiczb[1]);

        /*
        Zadanie2 tablica miast
         */
        String tablicaMiast[] = {"Toruń","Poznań","Berlin"};

        // poniższe linijki są tożsame - przypomnienie typy obiektowe
        String napis = "napis";
        napis.toLowerCase();
        String napis2 = new String("napis");
        napis2.toLowerCase();

        "napis3".toLowerCase();



    }
}
