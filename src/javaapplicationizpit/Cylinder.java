/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationizpit;

/**
 *
 * @author fmi
 */
public class Cylinder extends Figura{
    private double r,h;
    
    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
     }
    @Override
    public double V(){
        return (Math.round(100*r*r*h*Math.PI))/100.;
    }
    @Override
    public double S(){
        return (Math.round(100*2*r*Math.PI*(r+h)))/100.;
        
    }
    @Override
   public String getNameFigure(){
       return "Cylinder";
   }
   
   
    @Override
   public double getR(){
       return r;
   } 
    
    @Override
    public double getH(){
       return h;
   }
}
