//Ned Ean
//Going in Circles
//April 12th 2017        

package going.in.circles;

import java.io.*;
import java.util.*;

public class GoingInCircles {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is area? ");
        double area = kbReader.nextDouble();
        System.out.println("The radius of your circle is " + (Math.sqrt((area/Math.PI))));
    }
    
}
