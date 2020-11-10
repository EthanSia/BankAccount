package dkit.oop;
/**
 * BankAccount Class Demo
 * Demonstrates:
 * - Classes and object creation
 * - Static fields and static methods
 * - ArrayList of objects
 * - passing ArrayLists as arguments (into methods)
 *
 * You should attempt the TO-DO exercises in the embedded comments.
 *
 * See JUnit tests also.
 */

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("BankAccount App");
        App app = new App();
        app.start();
    }

    public void start() {

        BankAccount harrysAccount = new BankAccount(400);
        System.out.println("Harry's account number = " + harrysAccount.getAccountNumber());

        // use System.out.format when using format specifiers ( like %.2f ). Note comma instead of +
        System.out.format("Harry's initial account balance = %.2f \n", harrysAccount.getBalance());

        harrysAccount.withdraw(200);
        harrysAccount.deposit(100);

        System.out.format("Harry's account balance (after transactions) = %.2f \n", harrysAccount.getBalance());

        harrysAccount.addInterest(4.5);
        System.out.format("Harry's account balance (after adding interest) = %.2f \n", harrysAccount.getBalance());

        BankAccount meghansAccount = new BankAccount(2050.50);
        System.out.println("Meghans's account number = " + meghansAccount.getAccountNumber());
        System.out.format("Meghans's initial account balance = %.2f \n", meghansAccount.getBalance());

        // ArrayList of BankAccount objects
        // Create a list of 5 accounts with various initial balances.
        ArrayList<BankAccount> accountsList = new ArrayList<>();
        accountsList.add( new BankAccount(100.11) );
        accountsList.add( new BankAccount(200.22) );
        accountsList.add( new BankAccount() );  // invoke no-arg constructor
        accountsList.add( new BankAccount(400.44) );
        accountsList.add( new BankAccount(500.55) );

        // Iterate over list and print all account details (using toString() )
        for( BankAccount account : accountsList)
        {
            System.out.println(account);
        }

        //TODO
        // Calculate the sum of the balances in the accounts
        // by looping over the list.
        double sum = 0;
        for( BankAccount account : accountsList)
        {
            sum=sum+account.getBalance();
        }
        System.out.println("Sum of all account's balance: "+sum);
        //TODO
        // Add a special Covid-19 payment of 200.00 to all accounts
        // by looping over the list.
        System.out.println("Add covid 19 payament");
        for( BankAccount account : accountsList)
        {
            account.deposit(200.00);
            System.out.println(account);
        }


        //TODO
        // Add interest of 6.5% to all accounts in the list by
        // looping over the list and calling addInterest()
        System.out.println("Add interest of 6.5%");
        for(BankAccount account : accountsList)
        {
            account.addInterest(6.5);
            System.out.println(account);
        }

        //TODO
        // Write a method to return the average account balance
        // double calculateAverageAccountBalance( arraylist )
        System.out.println("Average account balance");
        BankAccount account = new BankAccount();
        double average = account.calculateAverageAccountBalance(accountsList);
        System.out.println(average);

        //TODO
        // Write a method to accept the list of accounts and
        // return a reference to the account with the largest balance.
        // Print the returned BankAccount object details.
        System.out.println();
        BankAccount largest = findAccountWithLargestBalance(accountsList);
        if(largest != null)
        {
            System.out.println("Largest is: "+largest.toString());
        }

        //TODO
        // What are the implications of the following code.
        // Draw a memory diagram to represent the situation.


        BankAccount williamsAccount = harrysAccount;
        System.out.format("William's account balance = %.2f \n", williamsAccount.getBalance());

        // Explain what will happen below.
        williamsAccount.withdraw(100);//when withdraw 100 in williamsAccount, also withdraw 100 in harrysAccount// cuz they use the same reference

        //TODO
        // Get the direct average method in class FinancialUtility.
        System.out.println("Direct average "+FinancialUtility.average(4,6));
    }

    public  void printArrayList(ArrayList<BankAccount>arrList)
    {
        for(BankAccount account : arrList)
        {
            System.out.println(account);
        }
    }

    public BankAccount findAccountWithLargestBalance(ArrayList<BankAccount>arrList)
    {
        double largestBalance = 0.0;
        BankAccount largest = null;

        for(BankAccount account : arrList)
        {
            if(account.getBalance() > largestBalance)
            {
                largestBalance = account.getBalance();
                largest =account;
            }
        }
        return largest;
    }
}
