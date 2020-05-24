package pl.sdacademy.tarr2020java6.java.zaawansowana.typy.generyczne;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 24.05.2020
 **/
public interface Polowanie<A> {

    public void rozpoczecie();

    public void zlapanieDoKlatki(A animal);
}
