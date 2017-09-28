//Ned Ean
//Name Reversal
//April 18th 2017 
package name.reversal;

import java.io.*;
import java.util.*;

public class NameReversal {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Please enter your name. ");
        
        String nameofuser = kbReader.nextLine();
        String lowercasename = nameofuser.toLowerCase();
        
        for(int length = nameofuser.length(); length > 0; length--)
        {
            System.out.print(lowercasename.substring(length - 1, length));
        }
    }
}
