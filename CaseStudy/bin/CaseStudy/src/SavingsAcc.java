/*Savings Account*/
public abstract class SavingsAcc extends BankAcc {
	private static final float MINBAL = 10000; // Final values need to set values beforehand
	private boolean isSalaried;
	private float amount;

	public SavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal); // calling parent constructor explicitly
		this.isSalaried = isSalaried;
	}

	public void withdraw(float amount) {
		this.amount = amount;
		if (amount > MINBAL) // the minimum criteria for withdrawal
		{
			System.out.println("Error!!!! Sorry");
		} else {

			setAccBal(getAccBal() - amount); // deduction of money from account balance and then returns the value

		}
	}

	public String toString() {
		return "SavingsAccount[account No is" + (getAccNo()) + ",account name is" + (getAccNm())
				+ " account balance is " + (getAccBal()) + "]"; // toString method is used to return the full print
																// statement

	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
}
