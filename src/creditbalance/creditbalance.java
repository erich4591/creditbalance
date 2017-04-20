package creditbalance;

import java.util.Scanner;
 
public class creditbalance {
 
    public static void main(String[] args) {
 
        int balance;
        int creditLimit;
        
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter Current Balance:");
        balance = input.nextInt();
 
        System.out.println("Enter Credit Limit:");
        creditLimit = input.nextInt();
 
        int newBalance = creditLimit - balance;
 
        System.out.println("Your available Credit is $" +newBalance);
    }
}