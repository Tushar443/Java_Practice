package AutoBoxing_Challenge;

public class Main {
	public static void main(String[] args) {
		
		
		Bank bank =new Bank("Bank of India");
		
		if(bank.addBranch("Mumbai")) {
			System.out.println("Branch is created");
		}
		
		bank.addCustomer("Mumbai", "Tushar", 10000);
		bank.addCustomer("Mumbai", "Prakash", 29000);
		bank.addCustomer("Mumbai", "Rahul", 15000);
		
		if(!bank.addCustomer("Mumbai", "Tushar", 10000)){
			System.out.println("Name already exits");
		}
		
		if(bank.addBranch("Satara")) {
			System.out.println("Branch is created");
		}
		bank.addCustomer("Satara", "Tanaji", 123000);
		bank.addCustomer("Satara", "Payal", 10);
		bank.addCustomer("Satara", "Jagutai", 1000);
		
		bank.addCustomerTransaction("Mumbai", "Tushar", 23);
		bank.addCustomerTransaction("Satara", "Payal", 100);
		bank.addCustomerTransaction("Satara", "Tanaji", 320);
		
		bank.ShowBranchList("Satara", true);
		bank.ShowBranchList("Mumbai",true);
		
		if(!bank.addCustomer("Sangli", "Rohit", 23)) {
			System.out.println("ERROR Not fouund branch does not exists");
		}
		
		if(!bank.addBranch("Satara")) {
			System.out.println("This branch is already in the list");
		}
		
		if(!bank.addCustomerTransaction("Satara", "Rahul", 23)) {
			System.out.println("Name does not exits");
			System.out.println("Do you want to add new customer y/n");
		}
	}
}
