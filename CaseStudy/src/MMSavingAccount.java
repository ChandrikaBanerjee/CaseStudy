
public class MMSavingAccount extends SavingsAcc{
	public MMSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}
	private static final float MINBAL=10000;
	
	
	
	public void withdraw(float amount) //Logic used for withdrawal
	{
	
		if(amount>MINBAL)
		{
			System.out.println("Error!!!! Sorry");
		}
		else
		{
			
			setAccBal(getAccBal()-amount);
			
		}
	}
	public String toString()  //ToString method behaviour implementation
	{
		return "MMSavingAccount[account No is" + (getAccNo()) + ",account name is" +(getAccNm())+ " account balance is " + (getAccBal()) +"]";
	}
}
