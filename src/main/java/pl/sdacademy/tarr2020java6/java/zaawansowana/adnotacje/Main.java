package pl.sdacademy.tarr2020java6.java.zaawansowana.adnotacje;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 21.05.2020
 **/
public class Main {


    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {

        MyClass myClass = new MyClass();


        /**
         * Pobranie adnotacji z metody
         */
        Method method = myClass.getClass().getMethod("method");
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

        System.out.println(annotation.B());

        /**
         * Pobranie adnotacji z pola
         */
        Field fieldName = myClass.getClass().getField("name");
        FieldAnnotation annotationField = fieldName.getAnnotation(FieldAnnotation.class);
        System.out.println(annotationField.author());
    }


}
