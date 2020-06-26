import java.util.*;
public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static MobilePhone mp=new MobilePhone("8097217990");
	public static void main(String[] args) {
			boolean quit=false;
			startPhone();
			printOptions();
			while(!quit) {
				System.out.println("6  -to print a list of available actions");
				int option =sc.nextInt();
				switch(option) {
				case 0: 
						System.out.println("Shutting down ...");
						quit =true;
						break;
				case 1: 
						if(mp.phoneContacts()) {
							System.out.println("List is Empty");
						}
						break;
				case 2: 
						addContact();
						break;
				case 3:
						updateContact();
						break;
				case 4:
						removeContact();
						break;
				case 5:
						queryContact();
						break;
				case 6:
						printOptions();
						break;
				}
			}
	}
	
	public static void addContact() {
		System.out.print("Enter the Name :");
		String name =sc.nextLine();
		sc.nextLine();
		System.out.print("Enter the number");
		String number=sc.nextLine();
		Contacts contact=Contacts.createContacts(name, number);
		if(mp.addNewContact(contact))
			System.out.print("New contact added :" + name +",phone => "+number);
		else 
			System.out.println("can not add : "+ name +" is already on file");
	}
	
	private static void updateContact() {
		System.out.println("Enter existing name :");
		String oldName =sc.nextLine();
		Contacts exitingContact= mp.queryContact(oldName);
		if(exitingContact ==null) {
			System.out.println("COntact not found");
			return;
		}
		System.out.println("Enter new name and number");
		String newName=sc.nextLine();
		String newNumber=sc.nextLine();
		
		Contacts newContact=Contacts.createContacts(newName, newNumber);
		if(mp.updateContact(exitingContact, newContact)) {
			System.out.println("successfully update record");
		}
		else 
			System.out.println("error updating record");
	}
	
	private static void removeContact() {
		System.out.println("Enter existing name :");
		String oldName =sc.nextLine();
		Contacts exitingContact= mp.queryContact(oldName);
		if(exitingContact ==null) {
			System.out.println("COntact not found");
			return;
		}
		
		if(mp.removeContact(exitingContact)) {
			System.out.println("successfully remove record");
		}
		else 
			System.out.println("error deleting record");
	}
	
	private static void queryContact() {
		System.out.println("Enter existing name :");
		String oldName =sc.nextLine();
		Contacts exitingContact= mp.queryContact(oldName);
		if(exitingContact ==null) {
			System.out.println("COntact not found");
			return;
		}
		System.out.println("Name : "+exitingContact.getName()+ " Phone Number:- "+exitingContact.getPhoneNumber());
	}
	public static void startPhone() {
		System.out.println("Starting phone ...");
	}
	
	public static void printOptions() {
		System.out.println("\n Available options : \n press");
		System.out.println("0  -to shutdown\n"
						+  "1  -to print contacts\n"
						+  "2  -to add contact\n"
						+  "3  -to update contact"
						+  "4  -to remove contact\n"
						+  "5  -queary if an existing contact exists\n"
						+  "6  -to print a list of available actions\n");
		System.out.println("Choose your action : ");
	}
}
