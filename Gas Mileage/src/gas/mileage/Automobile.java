
package gas.mileage;

import java.io.*;
import java.util.*;

public class Automobile {
    Scanner userinput = new Scanner(System.in);
    public Automobile(String n, double mpg){
        name = n;
        miles = mpg;
    }
    
    public double fillUp() {
        System.out.println("How much fuel do you want to fill up? ");
        gallons = userinput.nextDouble();
        return gallons;
    }
    public double takeTrip() {
        System.out.println("How many miles do you want to travel? ");
        distance = userinput.nextDouble();
        return distance;
    }
    public double reportFuel() {
        gallons = gallons - (distance / miles);
        System.out.println(distance);
        System.out.println(miles);
        System.out.println(distance/miles);
        System.out.println("You have " + gallons + " gallons of fuel left");
        return gallons;
    }
    public String name;
    public double miles;
    public double distance;
    public double amount;
    public double gallons;
    public double mpg;
}
