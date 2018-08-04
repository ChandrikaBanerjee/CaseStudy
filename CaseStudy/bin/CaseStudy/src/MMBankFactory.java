/*MMBank Factory*/
public class MMBankFactory extends BankFactory {
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc mms = new MMSavingAcc(accNo, accNm, accBal, isSalaried); //declaration of the abstract method from the parent class
		return mms;
	}

	public MMCurrentAccount getNewCurrentAcc(int accNo, String accNm, float accBal, float credLimit) {
		MMCurrentAccount mmc = new MMCurrentAccount(accNo, accNm, accBal, credLimit);  //declaration of the abstract method from the parent class
		return mmc;
	}
}
