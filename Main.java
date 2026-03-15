import java.util.Scanner;

void main()
{
    Scanner scan = new Scanner(System.in);
    boolean isWorkimg = true;
    short answer;

    while (isWorkimg)
    {
        System.out.println("Available operations:" +
                    "\n\t 1. Create a bank account " +
                    "\n\t 2. Check balance " +
                    "\n\t 3. Deposit money " +
                    "\n\t 4. Withdraw money " +
                    "\n\t 5. Exit ");
        System.out.print("Choose an option: ");
        answer = scan.nextShort();
        
        switch (answer) {
            case 1:
                System.out.print("Write a name for your Account: ");
                String userName = scan.next();
                Bank.CreateAccount(userName);
                break;
            case 2:
                System.out.print("Enter account ID: ");
                long ID = scan.nextLong();
                Bank.CheckBalance(ID);
                break;
            case 3:
                System.out.print("Enter account ID: ");
                long ID2 = scan.nextLong();
                Bank.Deposit(ID2);
                break;
            case 4:
                System.out.print("Enter account ID: ");
                long ID3 = scan.nextLong();
                Bank.Withdraw(ID3);
                break;
            case 5:
                System.out.println("Goodbye!");
                isWorkimg = false;
                break;
            default:
                System.out.println("Try again.");
        }
    }

}
