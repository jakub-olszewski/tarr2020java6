package pl.sdacademy.tarr2020java6.abstrakcja;

import pl.sdacademy.tarr2020java6.abstrakcja.interfejsy.Informacje;
import pl.sdacademy.tarr2020java6.abstrakcja.interfejsy.Obliczenia;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public abstract class Figura implements Informacje, Obliczenia{

    protected String nazwa;


    @Override
    public void wypiszInformacje() {
        wypiszNazwe();
    }

    @Override
    public void wypiszNazwe() {
        System.out.println(nazwa);
    }

    @Override
    public float obliczPole() {
        return 0;
    }

    @Override
    public float obliczObwod() {
        return 0;
    }
}
