package day3_Examples;

public class transactions{
	private String transactionMoney;
	private String typeOfCard;
    
    /*public transactions(String id, String name, String address, String phoneNumber, String email, String founds) {
		super(id, name, address, phoneNumber, email, founds);
	}
    
    public transactions(String id, String name, String address, String phoneNumber, String email, String founds, String transactionMoney, String typeOfCard) {
		super(id, name, address, phoneNumber, email, founds);
	}*/

	public transactions(String transactionMoney, String typeOfCard) {
		this.transactionMoney = transactionMoney;
		this.typeOfCard = typeOfCard;
	}
	
	public String getTransactionMoney() {
		return transactionMoney;
	}

	public void setTransactionMoney(String transactionMoney) {
		this.transactionMoney = transactionMoney;
	}

	public String getTypeOfCard() {
		return typeOfCard;
	}

	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}

	@Override
	public String toString() {
		return "Increase Money: "+this.getTransactionMoney()+" - Type of card: "+this.getTypeOfCard();
	}
}