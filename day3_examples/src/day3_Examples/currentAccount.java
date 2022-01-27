package day3_Examples;

public class currentAccount{
	private String cardNumber;
    private String nip;
    private String clabe;

    /*public currentAccount(String id, String name, String address, String phoneNumber, String email, String founds) {
		super(id, name, address, phoneNumber, email, founds);
	}
    
    public currentAccount(String id, String name, String address, String phoneNumber, String email, String founds, String cardNumber, String nip, String clabe) {
		super(id, name, address, phoneNumber, email, founds);
	}*/
    
    public currentAccount(String cardNumber, String nip, String clabe) {
    	this.cardNumber = cardNumber;
    	this.nip = nip;
    	this.clabe = clabe;
    }
    
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getClabe() {
		return clabe;
	}

	public void setClabe(String clabe) {
		this.clabe = clabe;
	}

	@Override
	public String toString() {
		return "Card Number: "+this.getCardNumber()+" - NIP: "+this.getNip()+" - CLABE: "+this.getClabe();
	}
}