//Ned Ean
//Gas Mileage
//May 17th 2017

package gas.mileage;

import java.io.*;
import java.util.*;

public class GasMileage {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        
        double gallons;
        
        System.out.println("What's the name of your car? ");
        String name = userinput.next();
        
        System.out.println("What's the gas mileage of your car? ");
        double mpg = userinput.nextDouble();
        
        Automobile Car = new Automobile(name, mpg);
        
        System.out.println(Car.fillUp());
        
        System.out.println(Car.takeTrip());
        
        System.out.println(Car.reportFuel());
        
       
    }
    
}
