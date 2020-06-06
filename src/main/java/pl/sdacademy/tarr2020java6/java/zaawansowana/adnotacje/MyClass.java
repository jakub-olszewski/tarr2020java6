package pl.sdacademy.tarr2020java6.java.zaawansowana.adnotacje;

import javax.annotation.processing.SupportedAnnotationTypes;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 21.05.2020
 **/
public class MyClass {

    @FieldAnnotation(name = "imie", author = "trener")
    public String name;

    @MyAnnotation(A = "12.32.12.3", B = "administrator")
    public void method(){
        MyAnnotation annotationValues = null;
        try {
            annotationValues = this.getClass()
                    .getMethod("method")
                    .getAnnotation(MyAnnotation.class);
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }

        // wypisuje wartosc adnotacji A
        System.out.println(annotationValues.A());

    }
}
