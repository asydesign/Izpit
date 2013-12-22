/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationizpit;

/**
 *
 * @author fmi
 */
public class Cone extends Figura{
     private double r,h,l;
    
    public Cone(double r, double h, double l){
        this.r = r;
        this.h = h;
        this.l = l;
     }
    
    @Override
    public double V(){
        return (Math.round(100*r*r*h*Math.PI/3.))/100.;
    }
    @Override
    public double S(){
        return (Math.round(100*r*Math.PI*(r+l)))/100.;
        
    }
    @Override
   public String getNameFigure(){
       return "Cone";
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
