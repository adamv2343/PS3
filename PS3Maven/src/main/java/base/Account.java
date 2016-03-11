package base;
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}

	public Account(int newid, double newBalance, double newAnnualInteresrate) {
		id = newid;
		balance = newBalance;

	}

	public int getId() {
		return id;

	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;

	}

	public void setDateCreated(Date newDateCreated) {
		dateCreated = newDateCreated;

	}

	double getMonthlyInterestRate() {
		return annualInterestRate / 12;

	}

	void withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance)
		{
			throw new InsufficientFundsException(balance-amount);
		}
		else
		{
			
			balance -= amount;
		}
		

	}

	double deposit(double amount) {
		return balance += amount;

	}

}
