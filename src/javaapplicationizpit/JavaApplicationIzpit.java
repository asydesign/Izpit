/*
 Да се дефинира класът на обект, който може да съдържа и управлява геометрична фигура както
 цилиндър, така и конус (и двете прави, кръгови). 
 * Обектът трябва да може да съобщава вида и
 размерите на фигурата (като низ) и обема й (като число). 
 * Когато в обекта няма фигура, да се връщат
 съответно съобщение "Няма фигура." и обем нула. Също така, по време на съществуването си
 обектът трябва да може да премахва управляваната фигура или да я замества с друга.
 Да се инициализира обект, управляващ конус и да се изведат данните за него, включително
 повърхнината му. След това конусът да се замести с цилиндър и да се изведат данните за
 цилиндъра, заедно с повърхнината му.
 */
package javaapplicationizpit;

public class JavaApplicationIzpit {

    public static void main(String[] args) {
        User asy = new User();

        Figura myCylinder = new Cylinder(1, 2);
        asy.setFigura(myCylinder);
        asy.getInfoVolume();
        asy.getInfoSurface();
        
        asy.clearFigura();
        asy.getInfoVolume();

        System.out.println();

        Figura myCone = new Cone(1, 2, 3);
        asy.setFigura(myCone);
        asy.getInfoVolume();
        asy.getInfoSurface();
        asy.clearFigura();
        asy.getInfoVolume();
    }
}
