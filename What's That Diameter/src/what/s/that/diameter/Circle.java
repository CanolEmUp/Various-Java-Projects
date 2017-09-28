/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package what.s.that.diameter;

/**
 *
 * @author 323828699
 */
public class Circle {
    
    public Circle(double r){
        radius = r;
    }
    public double diameter(){
       double d = radius * 2;
       return d;
    }
    public double radius;
}
