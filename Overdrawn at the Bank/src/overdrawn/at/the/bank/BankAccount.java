
package overdrawn.at.the.bank;

import java.io.*;
import java.util.*;

public class BankAccount {
    Scanner userinput = new Scanner(System.in);
    public BankAccount(double b, String n) {
        balance  = b;
        name = n;
    }
    
    public double deposit() {
        System.out.println("How much do you want to deposit?");
        double amount = userinput.nextDouble();
        balance = balance + amount;
        return balance;
    }
    public double withdraw() {
        System.out.println("How much do you want to withdraw?");
        double amount = userinput.nextDouble();
        balance = balance - amount;
        return balance;
    }
    public double balance;
    public String name;
}
