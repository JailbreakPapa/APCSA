import java.util.*;

public class Bank {
    private String name = "";
    private int accHash;
    private int balance = 0;
    private Account[] accounts;
    private Scanner scan = new Scanner(System.in);
    private final int MAX = 30;

    public Bank() {
        accounts = new Account[MAX];
        for (int a = 0; a < MAX; a++) {
            accounts[a] = new Account("unused", 0, 0.0);
        }
    }

    public void create() {
        boolean checked = false;
        while (checked != true) {
            System.out.println("What is your account number?");
            accHash = scan.nextInt();
            scan.nextLine();
            boolean found = false;
            for (int s = 0; s < MAX; s++) {
                if (accounts[s].getAccountNumber() == accHash) {
                    System.out.println("This Account Number is already used. try again.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                for (int s = 0; s < MAX; s++) {
                    if (accounts[s].getAccountName().equals("unused")) {
                        System.out.println("Whats your name?");
                        accounts[s].setName(scan.nextLine());
                        System.out.println("What balance are you starting with?");
                        accounts[s].setAccountNumber(accHash);
                        accounts[s].deposit(scan.nextDouble());
                        checked = true;
                        break;
                    }
                }
            }
        }

    }

    public void withdraw() {
        boolean valid = false;

        while(valid == false)
        {
            System.out.println("What is your user number?");
            int a = scan.nextInt();
            scan.nextLine(); // consume newline
            for(int v = 0; v < accounts.length; v++)
            {
                if(accounts[v].getAccountNumber() == a)
                {
                    System.out.println("How much do you want to withdraw?");
                    double de = scan.nextDouble();
                    accounts[v].withdraw(de, 0.0f);
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                System.out.println("Invalid Account Number, try again.");                                                                                                                                                                       
            }
        }
    }

    public void deposit() {
        boolean valid = false;

        while(valid == false)
        {
            System.out.println("What is your user number?");
            int a = scan.nextInt();
            scan.nextLine(); // consume newline
            for(int v = 0; v < accounts.length; v++)
            {
                if(accounts[v].getAccountNumber() == a)
                {
                    System.out.println("How much do you want to deposit?");
                    double de = scan.nextDouble();
                    accounts[v].deposit(de);
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                System.out.println("Invalid Account Number, try again.");
            }
        }
    }

    public String toString() {
        String cfinal ="";
        for(Account d : accounts)
        {
            if (!d.getAccountName().equals("unused")) {
                cfinal += "Account Number: " + d.getAccountNumber() +"\n" + "Account Balance: " + d.getBalance() + "\n" + "Account Name: " + d.getAccountName() + "\n\n";
            }
        }
        return cfinal;
    }
}