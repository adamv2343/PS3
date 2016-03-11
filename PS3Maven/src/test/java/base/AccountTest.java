package base;


import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
	

	@Test
	public void test() {
		int id=1122;
	    double balance = 20000;
	    double annualInterestRate=4.5;
	    
	    Account a = new Account(id, balance, annualInterestRate);   
	    
	    try {
			a.withdraw(2500);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
	    assertTrue(a.getBalance()==17500);
	    a.deposit(3000);
	    
	    assertTrue(a.getBalance() == 20500);
	    
	}
}

