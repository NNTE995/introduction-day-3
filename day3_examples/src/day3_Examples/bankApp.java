package day3_Examples;

import java.util.*;

public class bankApp {
	
	public int executeMainMenu() {
		int in;
        Scanner option = new Scanner(System.in);   
        do{ 
        	System.out.println("Welcome to Bank Application! Select an option \n\t1) Add new user \n\t2) Add savings \n\t3) Add Current Account \n\t4) Add Mortgage \n\t5) Add Transaction \n\t6) See Data \n\t7) Close App");
        	in = option.nextInt();
        }
        while(in > 7 || in < 1);
        return in;
        }

    public List<customers> executeCase1Menu() {
        int s2;
        List<customers> addUser = new ArrayList<customers>();
        Scanner create = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        do{	
        	System.out.println("ID: ");
			String id = create.nextLine();
			System.out.println("Name: ");
			String name = create.nextLine();
			System.out.println("Address: ");
			String address = create.nextLine();
			System.out.println("Telephone Number: ");
			String phoneNumber = create.nextLine();
			System.out.println("Email: ");
			String email = create.nextLine();
			System.out.println("Found: ");
			String founds = create.nextLine();
			customers cust = new customers(id, name, address, phoneNumber, email, founds);
			addUser.add(cust);
			System.out.println("¿Do you want to add more users? \n1 = yes, 2 = No ");
			s2=s.nextInt();
        }
        while (s2 == 1);
        return addUser;
    }
    
    public List<savingAccount> executeCase2Menu() {
        int s3;
        List<savingAccount> addSaving = new ArrayList<savingAccount>();
        Scanner create2 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        do{	
        	System.out.println("Yearly Interest: ");
        	String yearlyInterest = create2.nextLine();
			savingAccount cust2 = new savingAccount(yearlyInterest);
			addSaving.add(cust2);
			System.out.println("¿Do you want to add more savings accounts? \n1 = yes, 2 = No ");
			s3=s2.nextInt();
        }
        while (s3 == 1);
        return addSaving;
    }
    
    public List<currentAccount> executeCase3Menu() {
        int s4;
        List<currentAccount> addCurrent = new ArrayList<currentAccount>();
        Scanner create3 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        do{	
        	System.out.println("Card Number: ");
			String cardNumber = create3.nextLine();
			System.out.println("Nip: ");
			String nip = create3.nextLine();
			System.out.println("CLABE: ");
			String clabe = create3.nextLine();
			currentAccount cust3 = new currentAccount(cardNumber, nip, clabe);
			addCurrent.add(cust3);
			System.out.println("¿Do you want to add more data? \n1 = yes, 2 = No ");
			s4=s3.nextInt();
        }
        while (s4 == 1);
        return addCurrent;
    }
    
    public List<mortgaugeAccount> executeCase4Menu() {
        int s5;
        List<mortgaugeAccount> addMortgage = new ArrayList<mortgaugeAccount>();
        Scanner create4 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);
        do{	
        	System.out.println("Loan ammount: ");
			String loan = create4.nextLine();
			System.out.println("Yearly Interest: ");
			String yearlyInteres = create4.nextLine();
			System.out.println("Years to Pay: ");
			String yearsToPay = create4.nextLine();
			System.out.println("Monthly pay: ");
			String monthlyPay = create4.nextLine();
			mortgaugeAccount cust4 = new mortgaugeAccount(loan, yearlyInteres, yearsToPay, monthlyPay);
			addMortgage.add(cust4);
			System.out.println("¿Do you want to add more data? \n1 = yes, 2 = No ");
			s5=s4.nextInt();
        }
        while (s5 == 1);
        return addMortgage;
    }
    
    public List<transactions> executeCase5Menu() {
        int s6;
        List<transactions> addTransaction = new ArrayList<transactions>();
        Scanner create5 = new Scanner(System.in);
        Scanner s5 = new Scanner(System.in);
        do{	
        	System.out.println("Transaction quantity: ");
			String transactionMoney = create5.nextLine();
			System.out.println("Type of Card: ");
			String typeOfCard = create5.nextLine();
			transactions cust5 = new transactions(transactionMoney, typeOfCard);
			addTransaction.add(cust5);
			System.out.println("¿Do you want to add more users? \n1 = yes, 2 = No ");
			s6=s5.nextInt();
        }
        while (s6 == 1);
        return addTransaction;
    }
	
	public static void main(String[] args) {
		int input;
        bankApp mainMenu = new bankApp();

        input = mainMenu.executeMainMenu();
        List<customers> customerList = new ArrayList<customers>();
        List<savingAccount> savingList = new ArrayList<savingAccount>();
        List<currentAccount> currentList = new ArrayList<currentAccount>();
        List<mortgaugeAccount> mortgageList = new ArrayList<mortgaugeAccount>();
        List<transactions> transactionList = new ArrayList<transactions>();

        while(input != 7) {
        	switch (input){
        	case 1:
        		System.out.println("Add User");
        		customerList = mainMenu.executeCase1Menu();
        		input = mainMenu.executeMainMenu();
        		break;
        	case 2:
        		System.out.println("Savings");
        		savingList = mainMenu.executeCase2Menu();
        		input = mainMenu.executeMainMenu();
        		break;
        	case 3:
        		System.out.println("Current Account");
        		currentList = mainMenu.executeCase3Menu();
        		input = mainMenu.executeMainMenu();
        		break;
        	case 4:
        		System.out.println("Mortgage Account");
        		mortgageList = mainMenu.executeCase4Menu();
        		input = mainMenu.executeMainMenu();
        		break;
        	case 5:
        		System.out.println("Transaction");
        		transactionList = mainMenu.executeCase5Menu();
        		input = mainMenu.executeMainMenu();
        		break;
        	case 6:
        		System.out.println(customerList.toString()+savingList.toString()+currentList.toString()+mortgageList.toString()+transactionList.toString());
        		input = mainMenu.executeMainMenu();
        		break;
            }
        }
	}
}