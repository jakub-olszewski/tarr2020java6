package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public class Lowca<A> implements Polowanie<A> {

    @Override
    public void rozpoczecie() {
        System.out.println("Rozpoczęcie polowania...");
    }

    @Override
    public void zlapanieDoKlatki(A animal) {
        System.out.println(animal+" został złapany do klatki");
    }
}
