package day3_Examples;

public class mortgaugeAccount{
	private String loan, yearlyInteres, yearsToPay, monthlyPay;

    /*public mortgaugeAccount(String id, String name, String address, String phoneNumber, String email, String founds) {
		super(id, name, address, phoneNumber, email, founds);
	}
    
    public mortgaugeAccount(String id, String name, String address, String phoneNumber, String email, String founds, String monthlyPay) {
		super(id, name, address, phoneNumber, email, founds);
		this.foundAccount = Integer.parseInt(founds);
		this.yearlyInteres = (yearlyInteres/100.0f) / 12.0f;
		this.yearsToPay = yearsToPay * 12.0f;
	}*/
    
    public mortgaugeAccount(String loan, String yearlyInteres, String yearsToPay, String monthlyPay) {
		super();
		this.loan = loan;
		this.yearlyInteres = yearlyInteres;
		this.yearsToPay = yearsToPay;
		this.monthlyPay = monthlyPay;
	}
    
	public String getLoan() {
		return loan;
	}

	public void setLoan(String loan) {
		this.loan = loan;
	}

	public String getYearlyInteres() {
		return yearlyInteres;
	}

	public void setYearlyInteres(String yearlyInteres) {
		this.yearlyInteres = yearlyInteres;
	}

	public String getYearsToPay() {
		return yearsToPay;
	}

	public void setYearsToPay(String yearsToPay) {
		this.yearsToPay = yearsToPay;
	}

	public String getMonthlyPay() {
		return monthlyPay;
	}

	public void setMonthlyPay(String monthlyPay) {
		this.monthlyPay = monthlyPay;
	}

	@Override
	public String toString() {
		return "Loan to pay: "+this.getLoan()+"Yearly Interes to pay: "+this.getYearlyInteres()+"Years to pay: "+this.getYearsToPay()+"Monthly mortgage to pay: "+this.getMonthlyPay();
	}
}