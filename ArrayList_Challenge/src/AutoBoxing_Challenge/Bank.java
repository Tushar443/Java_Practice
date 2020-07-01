package AutoBoxing_Challenge;

import java.util.ArrayList;

public class Bank {
	private String name;
	ArrayList<Branch> branches;
	
	public Bank(String name) {
		this.name=name;
		this.branches=new ArrayList<Branch>();
	}
	
	public boolean addBranch(String branchName) {
		if(findBranch(branchName)==null) {
			this.branches.add(new Branch(branchName));
			return true;
		}
		return false;
	}
	
	public boolean addCustomer(String branchName,String customerName,double initialAmount) {
		Branch branch=findBranch(branchName);
		if(branch != null) {
			return branch.newCustomer(customerName, initialAmount);
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName,String customerName,double amount) {
		Branch branch =findBranch(branchName);
		if(branch!=null) {
			return branch.addCustomerTransaction(customerName, amount);
		}
		return false;
	}
	
	private Branch findBranch(String branchName) {
		for(int i=0;i<this.branches.size();i++) {
			Branch checkBranch=this.branches.get(i);
			if(checkBranch.getName().equals(branchName)) {
				return checkBranch;
			}
		}
		return null;
	}
	
	public boolean ShowBranchList(String branchName,boolean showTransaction) {
		Branch branch=findBranch(branchName);
		if(branch !=null) {
			System.out.println("Customer Details for branch "+ branch.getName());
			
			ArrayList<Customer> branchCustomer=branch.getCustomers();
			
			for(int i=0;i<branchCustomer.size();i++) {
				Customer detailOfCustomer=branchCustomer.get(i);
				System.out.println("Customer " + detailOfCustomer.getName() + " ["+(i+1)+"]");
		
				if(showTransaction) {
					System.out.println("Transaction");
					ArrayList<Double> transaction=detailOfCustomer.getTransaction();
					for(int j=0;j<transaction.size();j++) {
						System.out.println("["+(j+1)+"] Amount "+ transaction.get(j));
						
					}
				
				}
			}
			return true;
		}
		else
			return false;
	}
}






