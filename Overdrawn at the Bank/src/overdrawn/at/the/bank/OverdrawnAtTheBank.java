//Ned Ean
//Overdrawn at the Bank
//May 16th 2017 
package overdrawn.at.the.bank;

import java.io.*;
import java.util.*;

public class OverdrawnAtTheBank {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        
        System.out.println("Please enter your name. ");
        String name = userinput.next();
        
        System.out.println("How much money is in your account? ");
        Double account = userinput.nextDouble();
        
        BankAccount MyAccount = new BankAccount(account,name);
        
        System.out.println(MyAccount.name + ", you have $" + MyAccount.balance + " in your account.");
        
        System.out.println("What action do you want to do? \n 1.Deposit \n 2.Withdraw ");
        
        int choice = userinput.nextInt();
        
        switch (choice){
            
        case 1:
            System.out.println(MyAccount.deposit());
            System.out.println(MyAccount.name + ", your new balance is $" + MyAccount.balance);
            break;
            
        case 2:
            System.out.println(MyAccount.withdraw());
            System.out.println(MyAccount.name + ", your new balance is $" + MyAccount.balance);
            break;
        
        }
    }  
}
