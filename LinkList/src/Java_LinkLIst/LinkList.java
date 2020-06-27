package Java_LinkLIst;

import java.util.*;

public class LinkList {
	
	public static void main(String[] args) {
		LinkedList<String> placeToVisit=new LinkedList<String>();
		//@# Add Normal Link List
//		placeToVisit.add("Mumbai");
//		placeToVisit.add("Satara");
//		placeToVisit.add("solapur");
//		placeToVisit.add("kolhapur");
//		placeToVisit.add("nasik");
//		placeToVisit.add("sangli");
//		
//		printList(placeToVisit);
//		
//		placeToVisit.add(1,"Nanded");
//		printList(placeToVisit);
//		
//		placeToVisit.remove(3);
//		printList(placeToVisit);
		
		//@# Add in alphabeticle order
		addInOrder(placeToVisit, "Mumbai");
		addInOrder(placeToVisit, "Satara");
		addInOrder(placeToVisit, "Solapur");
		addInOrder(placeToVisit, "Kolhapur");
		addInOrder(placeToVisit, "Nasik");
		addInOrder(placeToVisit, "Sangli");
		printList(placeToVisit);
		
		//addInOrder(placeToVisit, "Satara");
		
		//@# TO go to next and previous city
		
		visit(placeToVisit);
	}
	
	public static void printList(LinkedList<String> data) {
		Iterator<String> i=data.iterator();
		
		while(i.hasNext()) {
			System.out.println("Now visiting "+ i.next());
		}
		System.out.println("##########################");
	}
	
	private static boolean addInOrder(LinkedList<String> linkList ,String newCity) {
		ListIterator<String> listIterator =linkList.listIterator();
		while (listIterator.hasNext()) {
			int compare= listIterator.next().compareTo(newCity);
			
			if(compare==0) {
				//equal do not add
				System.out.println(newCity+" is already there");
				return false;
			}
			else if(compare>0) {
				//new city should appeare before this name
				//problem==> we already move to the next Node of linklist so we have to 
				//come back one step
				listIterator.previous();
				listIterator.add(newCity);
				return true;
			}
			else if(compare<0) {
				//move on next city
				//we don't need to add anything here
			}
		}
		
		listIterator.add(newCity);
		return true;
	}
	
	
	public static void visit(LinkedList cities) {
		Scanner sc =new Scanner(System.in);
		ListIterator<String> listIterator=cities.listIterator();
		boolean quit=false;
		boolean goingForward=true;
		if(cities.isEmpty()) {
			System.out.println("No cities in List");
			return ;
		}
		else {
			System.out.println("Now Visiting "+ listIterator.next());
			printMenu();
		}
		
		while(!quit) {
			System.out.print("Enter your Choice :- ");
			int action =sc.nextInt();
			switch (action) {
			case 0:
				System.out.println("Holiday over");
				quit = true;
				break;
			case 1:
				if(!goingForward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward=true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now Visiting "+ listIterator.next());
				}
				else {
					System.out.println("End List");
					goingForward=false;
				}
				break;
			case 2:
				if(goingForward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward=false;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now Visiting "+ listIterator.previous() );
				}
				else {
					System.out.println("we at start");
					goingForward=true;
				}
				break;
				
			case 3:
				printMenu();
			default:
				break;
			}
		}
		sc.close();
	}
	public static void printMenu() {
		System.out.println("Available actions :\npress");
		System.out.println("0 -to quit\n"
				+ "1- go to next city\n"
				+ "2- go to previous city\n"
				+ "3- print menu");
	}


}

















