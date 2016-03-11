package base;

public class InsufficientFundsException extends Exception {

	private double amtOverdrawn;

	public InsufficientFundsException(double amtOverdrawn) {
		super();
		this.amtOverdrawn = amtOverdrawn;
	}

	public double getAmtOverdrawn() {
		return amtOverdrawn;
	}

	public void setAmtOverdrawn(double amtOverdrawn) {
		this.amtOverdrawn = amtOverdrawn;
	}

	
}
