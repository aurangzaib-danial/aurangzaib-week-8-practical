
/**
 * NumberedBankMenuController
 *
 * Aurangzaib Danial Liaqat Khan
 * 12/03/2021
 */

public class NumberedBankMenuController extends ApplicationController
{

    public static void main(String[] args) {
        NumberedBankMenuController controllerInstance = new NumberedBankMenuController();
        controllerInstance.call();
    }

    public void welcome() {
        println("Welcome, please enter a number from the following options: ");
    }

    public void listMenu() {
        println("1. Show Balance");
        println("2. Withdraw");
        println("3. Deposit");
        println("4. Cancel");
    }

    public void menu() {
        String userInput = "";
        while (!userInput.equals("4")) {
            listMenu();
            userInput = getInput();
            switch (userInput) {
                case "1": showBalance(); break;
                case "2": withdraw(); break;
                case "3": deposit(); break;
                case "4": cancel(); break;
                default: printError("Please check your input"); break;
            }
        }
    }

}
