import java.util.HashMap;

public class ClientBase
{
    protected static HashMap<Long, Account> accountBase = new HashMap<>();

    protected static void AddAccount(long accountID, Account account)
    {
        accountBase.put(accountID, account);
    }

}
