
/**
 * CustomerAccount
 *
 * @author Aurangzaib Danial Liaqat Khan
 * @version 12/03/2021
 */
public class CustomerAccount
{

    private int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }
    
    public boolean withdraw(int amount) {
        if (amount > 0 && balance >= amount && balance != 0) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public int checkBalance() {
        return balance;
    }

}
