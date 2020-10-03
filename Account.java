/** This class will help teach us about Java and object-oriented programming. **/
public class Account {
	
	/** The amount of money in our Account. **/
	private int balance;

	/** Define our class in the constructor. **/
	public Account(int balance0) {
		balance = balance0;
	}

	/** Deposit money into our account. **/
	public int deposit(int amount) {
		balance += amount; 
		return balance;
	}


	/** Deposit money into our account. **/
	public int withdraw(int amount) {
		if (balance < amount) {
			System.out.println("Insufficient funds");
		} else {
			balance -= amount;
		}
	
		return balance;
	}
}
