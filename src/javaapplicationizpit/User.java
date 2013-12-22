/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationizpit;

/**
 *
 * @author fmi
 */
public class User {

    private Figura myFigura;

    public void setFigura(Figura myFigura) {
        this.myFigura = myFigura;
    }

    public void clearFigura() {
        this.myFigura = null;
    }   

    public void getInfoVolume() {
        if (myFigura != null) {
            System.out.println(myFigura.getNameFigure() + " has properties: r = " + myFigura.getR() + "; h = " + myFigura.getH());
            System.out.println(myFigura.getNameFigure() + " has Volume: " + myFigura.V());
        } else {
            System.out.println("There is no Figura! The Volume is 0.");
        }
    }

    public void getInfoSurface() {
        System.out.println(myFigura.getNameFigure() + " has Surface: " + myFigura.S());
    }
}
