package pl.sdacademy.tarr2020java6.abstrakcja.figury;

import pl.sdacademy.tarr2020java6.abstrakcja.Figura;
import pl.sdacademy.tarr2020java6.abstrakcja.interfejsy.Informacje;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class Kolo extends Figura implements Informacje {

    public Kolo(){
        nazwa = "Koło";
    }

    @Override
    public void wypiszInformacje() {
        wypiszNazwe();
    }

    @Override
    public void wypiszNazwe() {
        System.out.println(nazwa);
    }
}
