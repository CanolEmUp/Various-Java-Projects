//Ned Ean
//Even or Odd?
//April 12th 2017 
package even.or.odd;

import java.io.*;
import java.util.*;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = kbReader.nextInt();
        int numremain = (num % 2);
        
        if (numremain == 0){
            System.out.println("The integer " + num + " is even");
        }
        else if (numremain == 1){
            System.out.println("The integer " + num + " is odd");          
        }
    }
}
