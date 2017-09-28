//Ned Ean
//Weight on Other Planets
//April 18th 2017 
package weight.on.other.planets;

import java.io.*;
import java.util.*;

public class WeightOnOtherPlanets {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is your weight on Earth? ");
        double weight = kbReader.nextDouble();
        
        System.out.println("1. Voltar");
        System.out.println("2. Krypton");
        System.out.println("3. Fertos");
        System.out.println("4. Servontos");
        
        System.out.print("What is your choice? ");
        int choice = kbReader.nextInt();
        
        switch(choice)
        {
            case 1: //Voltar
                System.out.println("Your weight on Voltar would be " + (weight * 0.091));
                break;
            case 2: //Krypton
                System.out.println("Your weight on Krypton would be " + (weight * 0.720));
                break;
            case 3: //Fertos
                System.out.println("Your weight on Fertos would be " + (weight * 0.865));
                break;
            case 4: //Servontos
                System.out.println("Your weight on Servontos would be " + (weight * 4.612));
                break;        
        }
    }   
}
