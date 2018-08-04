
public abstract class CurrentAcc extends BankAcc {
	private final float credLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float credLimit)

	{
		super(accNo, accNm, accBal); //explicitly invoking parent constructor
		this.credLimit = credLimit;

	}

	public float getCredLimit() {
		return credLimit;
	}

	public void withdraw(float amount) {
		float balance = getAccBal();                   
		if (amount > (credLimit + balance))              //condition for withdrawal
			System.out.println("Cant withdraw");
		else
			setAccBal(getAccBal() - amount);
	}

	public String toString() {
		return "CurrentAccount[account No is" + (getAccNo()) + ",account name is" + (getAccNm())
				+ " account balance is " + (getAccBal()) + "]";
	} // toString method is used to return the full print statement

}
