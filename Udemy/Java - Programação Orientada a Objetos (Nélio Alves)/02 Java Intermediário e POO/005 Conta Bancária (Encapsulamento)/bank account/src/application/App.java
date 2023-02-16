package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account myAccount;

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char option = sc.next().charAt(0);
        if (option == 'y') {
            System.out.print("Enter the inital deposit value: ");
            double firstDeposit = sc.nextDouble();
            myAccount = new Account(accountNumber, accountHolder, firstDeposit);
        } else {
            myAccount = new Account(accountNumber, accountHolder);
        }
        System.out.println("\nAccount data:");
        System.out.println(myAccount);

        System.out.print("\nEnter a deposit value: ");
        myAccount.deposit(sc.nextDouble());
        System.out.println("Updated Account data:");
        System.out.println(myAccount);
        System.out.print("\nEnter a withdraw value: ");
        myAccount.withdraw(sc.nextDouble());
        System.out.println("Updated Account data:");
        System.out.println(myAccount);
        sc.close();
    }
}
