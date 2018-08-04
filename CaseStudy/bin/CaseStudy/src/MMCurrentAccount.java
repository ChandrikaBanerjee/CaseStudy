/*MMCurrent Account*/
public class MMCurrentAccount extends CurrentAcc {
	public MMCurrentAccount(int accNo, String accNm, float accBal, float credLimit) {
		super(accNo, accNm, accBal, credLimit); // explicitly invoking parent constructor
	}

	public void withdraw(float amount) {
		float balance = getAccBal();
		if (amount > (getCredLimit() + balance)) // Condition for withdrawal
			System.out.println("Cant withdraw");
		else
			setAccBal(getAccBal() - amount);
	}

	public String toString() {
		return "MMCurrentAccount[account No is" + (getAccNo()) + ",account name is" + (getAccNm())
				+ " account balance is " + (getAccBal()) + "]";
	} // toString method is used to return the full print
		// statement
}
