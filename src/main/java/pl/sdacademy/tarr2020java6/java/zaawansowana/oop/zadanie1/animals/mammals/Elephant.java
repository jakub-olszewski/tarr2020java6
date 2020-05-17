package pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.interfejsy.Prey;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.interfejsy.Vegetarian;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.plants.Plant;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 16.05.2020
 **/
public class Elephant extends Mammal implements Vegetarian, Prey {

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void eat(Plant plant) {

    }
}
