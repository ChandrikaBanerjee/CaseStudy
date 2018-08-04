/*Program on Advance Inheritance*/
public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;

	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;

	}

	public void setAccBal(float accBal) { // set get methods applied
		this.accBal = accBal;
	}

	public float getAccBal() {
		return accBal;
	}

	public String getAccNm() {
		return accNm;
	}

	public int getAccNo() {
		return accNo;
	}

	public void withdraw(float amount) {

		accBal -= amount; // this method performs sutraction of the amount from the account balance
	}

	public void deposit(float amount) {
		accBal += amount; // this method performs addition of the amount in the account balance
	}

	public String toString() {
		return "BankAccount[account No is" + accNo + ",account name is" + accNm + " account balance is " + accBal + "]";
	}  // toString method is used to return the full print
	// statement
}
