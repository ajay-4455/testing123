package test1;

public class bank {
	public static void greeting() {
		System.out.println("Welcome How are you?");
	}
	
	static int Currentbalance = 5000;
	
	public  void Deposit(int amount) {
		Currentbalance = Currentbalance + amount;
	}
	
	public static void Withdraw(int amount) {
		Currentbalance = Currentbalance - amount;
	}
	
	public  int  Currentbalance() {
		return Currentbalance;
	}



	public static void main(String[] args) {
		bank bank = new bank();
		greeting();
		System.out.println("current balance is : "+bank.Currentbalance());
		bank.Deposit(500);
		System.out.println("current balance is : "+bank.Currentbalance());
		Withdraw(1000);
		System.out.println("current balance is : "+bank.Currentbalance());

	}
}
	
