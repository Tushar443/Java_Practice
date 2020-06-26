import java.util.Scanner;

public class GroceryMain {
	private static Scanner sc=new Scanner(System.in);
	private static ArrayListGlocery groceryList=new ArrayListGlocery();
	
	public static void main(String[] args) {
		boolean quit=false;
		int choice =0;
		while(!quit) {
			System.out.println("Select one Choice");
			System.out.print("\n 1: for add items");
			System.out.print("\n 2: for remove items");
			System.out.print("\n 3: for modify items");
			System.out.print("\n 4: for search items");
			System.out.print("\n 5: for print grocery items");
			System.out.print("\n 6: for quit the application");
			choice=sc.nextInt();
			switch(choice) {
			case 1: 
					addItems();
					break;
			case 2: 
				removeItems();
				break;
			case 3: 
				modifyList();
				break;
			case 4: 
				serachItems();
				break;
			case 5: 
				groceryList.printGroceryList();
				break;
			case 6: 
				quit=true;
				break;
			}
		}
	}
	private static void addItems() {
		System.out.println("Enter the new item name");
		sc.nextLine();
		String item=sc.nextLine();
		groceryList.addGroceryItems(item);
		System.out.println(item +" is Added succesfully");
	}

	private static void removeItems() {
		System.out.println("Enter Position of element to be remove");
		int pos =sc.nextInt();
		groceryList.removeGroceryItem(pos);
	}

	private static void modifyList() {
			System.out.println("Enter the position and replacement item name");
			int pos =sc.nextInt();
			sc.nextLine();
			String newItem= sc.nextLine();
			groceryList.modifyGroceryItem(pos-1, newItem);
	}

	private static void serachItems() {
			System.out.println("Enter the search item ");
			String searchItem =sc.nextLine();
			if(groceryList.findItem(searchItem)!=null) {
				System.out.println("Found "+ searchItem + "in our grocery");
			}
			else
				System.out.println(searchItem+" is not found");
	}
	
}

