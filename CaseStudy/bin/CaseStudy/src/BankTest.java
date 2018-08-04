
public class BankTest {

	public static void main(String args[]) {
		BankFactory mmbankFactory = new MMBankFactory();     //Here an object of MMBankFactory is created and the reference type is BankFactory(Upcasting)

		MMSavingAcc savingaccount = (MMSavingAcc) mmbankFactory.getNewSavingAcc(100, "ABC", 50000.0f, true); //storing the result in a variable of type class MMSAvingAcc
		System.out.println(savingaccount);         //print of the toString method before withdrawal
		
		savingaccount.withdraw(20000.0f);     
		
		System.out.println(savingaccount);    //print of the toString method after withdrawal
		
		MMCurrentAccount currentaccount = (MMCurrentAccount) mmbankFactory.getNewCurrentAcc(200, "PQR", 20000.0f,5000.0F); //storing the result in a variable of type class MMCurrentAccount
		System.out.println(currentaccount);    //print of the toString method before withdrawal
		
		currentaccount.withdraw(50000.0f);
		
		System.out.println(currentaccount);         //print of the toString method after withdrawal

	}
}
