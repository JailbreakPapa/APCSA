
public class TestBank {

	public static void main(String[] args) 
	{
		Bank bank = new Bank();
		bank.create();
		bank.create();
		bank.create();
		System.out.println(bank);
		bank.withdraw();
		bank.withdraw();
		System.out.println(bank);
		bank.deposit();
		bank.deposit();
		System.out.println(bank);
		//bank.addInterest();
		System.out.println(bank);
	}

}
