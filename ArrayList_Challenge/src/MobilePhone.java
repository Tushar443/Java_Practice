import java.util.*;
public class MobilePhone {
		private String myNumber;
		private ArrayList<Contacts> myContact; 
		
		public MobilePhone(String myNumber) {
			this.myNumber=myNumber;
			myContact=new ArrayList<Contacts>();
		}
		
		public boolean addNewContact(Contacts contact) {
			if(findContact(contact.getName())>=0) {
				System.out.println("Contact is already on file");
				return false;
			}
			myContact.add(contact);
			return true;
		}
		public boolean updateContact(Contacts oldContact,Contacts newContact) {
			int findPosition =findContact(oldContact);
			if(findPosition<0) {
				System.out.println(oldContact.getName()+" , was not found");
				return false;
			}else if(findContact(newContact.getName()) !=-1) {
				System.out.println("Contact with name "+ newContact.getName() 
									+ " already exists.  Update was not successful");
				return false;
			}
			this.myContact.set(findPosition,newContact);
			System.out.println(oldContact.getName() +" was replace by " + newContact.getName());
			return true;
		}
		
		private int findContact(Contacts contact) {
			return this.myContact.indexOf(contact);
		}
		
		private int findContact(String contactName) {
			for(int i=0;i<this.myContact.size();i++) {
				Contacts contact=this.myContact.get(i);
				if(contact.getName().equals(contactName))
					return i;
			}
			return -1;
		}
		
		public boolean removeContact(Contacts removeCont) {
			int findPosition=findContact(removeCont);
			if(findPosition>=0) {
			this.myContact.remove(findPosition);
			System.out.println(removeCont+" contact was remove");
			return true;
			}
			System.out.println(removeCont.getName() +" is not found");
			return false;
		}
		
		public boolean phoneContacts() {
			if(myContact.size()<=0) {
				return true;
			}
			else {
				System.out.println("Contacts List");
				for(int i=0;i<myContact.size();i++) {
					String name =this.myContact.get(i).getName();
					String number=this.myContact.get(i).getPhoneNumber();
					System.out.println(name +"=> "+ number);
				}
				return false;
			}
		}
		
		public String queryContact(Contacts contact) {
			if(findContact(contact) >=0) {
				return contact.getName();
			}
			return null;
		}
		
		public Contacts queryContact(String name) {
			int position=findContact(name);
			if(position>=0) {
				return this.myContact.get(position);
			}
			return null;
		}
}
