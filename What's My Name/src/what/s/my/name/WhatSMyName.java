//Ned Ean
//What's My Name?
//April 12th 2017 
package what.s.my.name;

import java.io.*;
import java.util.*;

public class WhatSMyName {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String first = kbReader.next();
        System.out.print("What is your last name? ");
        String last = kbReader.next();
        
        System.out.println("Your full name is " + first + " " + last);
    }
    
}
