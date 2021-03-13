
/**
 * BankMenuController
 *
 * Aurangzaib Danial Liaqat Khan
 * 13/03/2021
 */

import java.util.Scanner;

public class BankMenuController extends ApplicationController
{
    private CustomerAccount customer = new CustomerAccount();
    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        BankMenuController controllerInstance = new BankMenuController();
        controllerInstance.call();
    }

    public void call() {
        welcome();
        menu();
    }

    public void welcome() {
        println("Welcome, please enter a command from the following options (case-sensitive): ");
    }

    public void listMenu() {
        println("balance : Show Balance");
        println("withdraw : Withdraw");
        println("deposit : Deposit");
        println("cancel : Cancel");
    }

    public void menu() {
        String userInput = "";
        while (!userInput.equals("cancel")) {
            listMenu();
            userInput = getInput();
            switch (userInput) {
                case "balance": showBalance(); break;
                case "withdraw": withdraw(); break;
                case "deposit": deposit(); break;
                case "cancel": cancel(); break;
                default: printError("Please check your input"); break;
            }
        }
    }

    public void showBalance() {
        println("\n Your balance is " + customer.checkBalance() + "\n");
    }

    public void withdraw() {
        println("Please enter the amount you would like to withdraw");

        String userInput = getInput();

        if (!testIntegerInput(userInput)) return;
        
        int convertedInput = Integer.parseInt(userInput);
        
        if (customer.withdraw(convertedInput)) {
            println("\n Transaction successful, please take your cash \n");
        } else {
           printError("Failed! Either you do not have sufficient balance or you entered a negative number"); 
        }
    }
    
    public boolean testIntegerInput(String input) {
        if (isInteger(input)) {
            return true;
        } else {
            printError("Please try again and use integers only.");
            return false;
        }
    }

    public void deposit() {
        println("Please enter the amount you would like to deposit");

        String userInput = getInput();

        if (!testIntegerInput(userInput)) return;
        
        int convertedInput = Integer.parseInt(userInput);
        
        if (convertedInput > 0) {
            customer.deposit(convertedInput);
            println("\n Successfully deposited. \n");
        } else {
           printError("Please try again and enter an amount above zero"); 
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

    public boolean isInteger(String text) {
        try{
            int num = Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
        // this method is copied from https://stackoverflow.com/a/5439535
    }

    public void goodBye() {
        println("Good bye, see you later!");
    }

}
