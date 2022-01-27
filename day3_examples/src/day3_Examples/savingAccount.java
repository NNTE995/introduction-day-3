package day3_Examples;

public class savingAccount{
	private String yearlyInterest;

	public savingAccount(String yearlyInterest) {
		this.yearlyInterest = yearlyInterest;
	}

	public String getYearlyInterest() {
		return yearlyInterest;
	}

	public void setYearlyInterest(String yearlyInterest) {
		this.yearlyInterest = yearlyInterest;
	}

	@Override
	public String toString() {
		return "Monthly quantity to pay: "+getYearlyInterest();
	}
}