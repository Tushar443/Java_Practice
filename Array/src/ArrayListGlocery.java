import java.util.*;
public class ArrayListGlocery {
	private ArrayList<String> grocery =new ArrayList<String>();
	
	public void addGroceryItems(String item) {
		grocery.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("You have "+ grocery.size() + " items in your GroceryList");
		for(int i=0;i<grocery.size();i++)
				System.out.println((i+1) + " "+ grocery.get(i));
	}
	
	public void modifyGroceryItem(int pos,String newItem) {
		grocery.set(pos, newItem);
		System.out.println("Grocery Item "+ (pos+1) +" has been Added");
	}
	
	public void removeGroceryItem(int pos) {
		String item=grocery.get(pos);
		grocery.remove(pos);
		System.out.println("Grocery Item "+ (pos+1)+ " "+item +" has been Removed");
	}
	
	public String findItem(String serachItem) {
		//boolean itemFound=grocery.contains(serachItem);
		int position=grocery.indexOf(serachItem);
		if(position>=0)
			return grocery.get(position);
		return null;
	}
}
