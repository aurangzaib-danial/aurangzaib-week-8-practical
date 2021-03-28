/**
 * ApplicationController
 *
 * Aurangzaib Danial Liaqat Khan
 * 13/03/2021
 */

import java.util.Scanner;

public abstract class ApplicationController
{
    public CustomerAccount customer = new CustomerAccount();
    public Scanner scan = new Scanner(System.in);

    public void call() {
        welcome();
        menu();
    }
    
    public void welcome() {
    }
    
    public void menu() {
    }
        

    public void showBalance() {
        println("\n Your balance is " + customer.checkBalance() + "\n");
    }

    public void withdraw() {
        println("Please enter the amount you would like to withdraw");

        int userInput = getIntegerInput(); 
        
        if (customer.withdraw(userInput)) {
            println("\n Transaction successful, please take your cash \n");
        } else {
           printError("Failed! Either you do not have sufficient balance or you entered a negative number"); 
        }
    }
    
    public void deposit() {
        println("Please enter the amount you would like to deposit");

        int userInput = getIntegerInput(); 
        
        if (userInput > 0) {
            customer.deposit(userInput);
            println("\n Successfully deposited. \n");
        } else {
           printError("Your entered an amount less than zero!"); 
           deposit();
        }
    }
    
    public int getIntegerInput() {
        try{
            int userInput = Integer.parseInt(getInput());
            return userInput;
        } catch (NumberFormatException e) {
            printError("Please try again and use integers only.");
            return getIntegerInput();
        }
    }
    
    public void cancel() {
        goodBye();
        return;
    }

    public String getInput() {
        return scan.next();
    }

    public void printError(String message) {
        System.err.println(message);
    }

    public void println(Object arg) {
        System.out.println(arg);
        // make life easier by simple saying print instead of System.out.println
    }

    public void goodBye() {
        println("Good bye, see you later!");
    }

}
