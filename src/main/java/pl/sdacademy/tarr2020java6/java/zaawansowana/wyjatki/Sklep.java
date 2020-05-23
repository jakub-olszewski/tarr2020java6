package pl.sdacademy.tarr2020java6.java.zaawansowana.wyjatki;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public class Sklep {

    /**
     * Zadanie. Sprawdzanie na liście czy jest dany produkt
     * Jeśli nie ma to wyjątek że nie ma nia liście produktów
     */

    /**
     * Metoda przyjmuje jeden argument
     * @param produkt
     */
    public void poprosze(String produkt){
        if(produkt.isEmpty() || produkt.isBlank()){
            throw new IllegalArgumentException("Nie mam takiego produktu o nazwie '"+produkt+"' !");
        }
        System.out.println("Otrzymałeś :"+produkt);
    }

    /**
     * Metoda na dowolną liczbę argumentów - więcej poczytaj o VarArgs
     * @param produkty
     */
    public void poprosze(String... produkty){
        for(String produkt : produkty){
            try {
                poprosze(produkt);
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }
}
