import java.util.Random;

public class Account
{
    private String clientName;
    private long clientID;
    Random random = new Random();
    private double balance;

    public Account(String clientName)
    {
        this.clientName = clientName;
        this.clientID = SetID();
        balance = 0;
        //this.balance = new Balance();
    }

    private long SetID()
    {
        long ID = random.nextLong(10000, 100000);
        while (ClientBase.accountBase.containsKey(ID))
        {
            ID = random.nextLong(10000, 100000);
        }
        return ID;
    }

    public long GetID(){
        return clientID;
    }

    public double GetBalance()
    {
        return balance;
    }

    public double Deposit(double money){
        balance += money;
        return balance;
    }

    public double Withdraw(double money){
        balance -= money;
        return balance;
    }
}
