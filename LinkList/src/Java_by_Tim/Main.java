package Java_by_Tim;

import java.util.*;

public class Main {
	public static void main(String[] args) {
//		Customer customer1=new Customer("Tushar",23.56);
//		Customer customer2;
//		customer2=customer1;
//		customer2.setBalance(12.34);
//		System.out.println(customer1.getName() + " "+ customer1.getBalance() );
//		ArrayList<Integer> intList=new ArrayList<Integer>();
//		intList.add(2);
//		intList.add(20);
//		intList.add(200);
//		for(int i=0;i<intList.size();i++) {
//			System.out.println("Data at " + i +" ==>"+ intList.get(i));
//		}
//		//Integer integer=new Integer(54); //error 
		
		ArrayList<Customer> customer =new ArrayList<Customer>();
		customer.add(new Customer("Tushar",2345));
		customer.add(new Customer("prakash",456));
		customer.add(new Customer("payal",2.45));
		
		for(int i=0;i<customer.size();i++) {
			System.out.println("name "+ customer.get(i).getName() + " and balance "+customer.get(i).getBalance());
		}
	}
	
}
