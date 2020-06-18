public class BankAccount{

	public static void main(String [] args){
		BankAcc a=new BankAcc(1,8000,"Tushar","moretushart33@gmail.com","8097217990");
		System.out.println("Name of Customer is " + a.getCustomerName());	
		a.withDraw(1000);
		System.out.println("Balance ==> " + a.getBalance());
		a.DepositFunds(10000);
		System.out.println("Balance ==> " + a.getBalance());
	}
}

class BankAcc{
	private int accountNumber;
	private double balance;
	private String customerName;
	private String emailID;
	private String phoneNum;

	public BankAcc(int accountNumber,double balance,String customerName,String emailID,String phoneNum){
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.customerName=customerName;
		this.emailID=emailID;
		this.phoneNum=phoneNum;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	public double getBalance(){
		return balance;
	}
	public String getCustomerName(){
		return customerName;
	}
	public String getEmailID(){
		return emailID;
	}
	public String getPhoneNum(){
		return phoneNum;
	}
	public void DepositFunds(double Amount){
		balance=balance + Amount;
		System.out.println(Amount +" is Creadited in your Accounnt");	
	}
	public void withDraw(double Amount){
		if((balance-Amount) >1000){
			balance=balance-Amount;	
			System.out.println(Amount+" is deducted from your Account ");		
		}
		else
		System.out.println("Insufficient Balance");
	}
}




















