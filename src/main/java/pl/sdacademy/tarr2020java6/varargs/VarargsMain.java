package pl.sdacademy.tarr2020java6.varargs;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class VarargsMain {

    //psvm
    public static void main(String[] args) {
        // varargs - zmienna liczba argumentów
        {
            int a = 5, b = 3;
            int wynik = suma(a, b);
        }
        {
            int a = 5, b = 3,c = 7;
            int wynik = suma(a, b,c);
        }
    }

    private static int suma(int a, int b) {
        return a + b;
    }
}
