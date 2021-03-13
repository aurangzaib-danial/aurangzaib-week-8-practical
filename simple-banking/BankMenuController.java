
/**
 * BankMenuController
 *
 * Aurangzaib Danial Liaqat Khan
 * 13/03/2021
 */

public class BankMenuController extends ApplicationController
{

    public static void main(String[] args) {
        BankMenuController controllerInstance = new BankMenuController();
        controllerInstance.call();
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

}
