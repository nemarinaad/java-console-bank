import java.util.Scanner;

public class Bank
{
    static Scanner scan = new Scanner(System.in);

    public static void CreateAccount(String userName)
    {
        Account account = new Account(userName);
        ClientBase.AddAccount(account.GetID(), account);
        System.out.println("You created an account with ID: " + account.GetID());
    }

    public static void CheckBalance(long ID)
    {
        System.out.println("Your balance: " + ClientBase.accountBase.get(ID).GetBalance());
    }

    public static void Deposit(long ID)
    {
        Account acc  = ClientBase.accountBase.get(ID);
        System.out.print("Enter the amount for deposit: ");
        double money = scan.nextDouble();
        System.out.println("Your balance: " + acc.Deposit(money));
    }

    public static void Withdraw(long ID)
    {
        Account acc  = ClientBase.accountBase.get(ID);
        System.out.print("Enter the amount for withdraw: ");
        double money = scan.nextDouble();
        System.out.println("Your balance: " + acc.Withdraw(money));
    }
}
