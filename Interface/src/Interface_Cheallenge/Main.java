package Interface_Cheallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Player tush=new Player("Tushar",100,85);
		System.out.println(tush.toString());
		saveObject(tush);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@222");
		tush.setHitPoints(8);
		//System.out.println(tush);
		tush.setWeapon("StromeBreaker");
		saveObject(tush);
		System.out.println(tush.toString());
		
		System.out.println("#######################333");
//		loadObject(tush);
		System.out.println(tush);
		
		ISaveable werewolf=new Monster("werewolf", 20,40);
		//werewolf.getStrength(); // it will get an error to solve that.
		System.out.println(((Monster)werewolf).getStrength());
		System.out.println(werewolf);
		saveObject(werewolf);
	}
	
	public static ArrayList<String> readValues(){
		ArrayList<String> values=new ArrayList<String>();
		
		Scanner sc=new Scanner(System.in);
		boolean quit =false;
		int index=0;
		System.out.println("1 :- for quit\n"
				+ "2  :- for enter the String ");
		while(!quit) {
			//System.out.print("Enter choice : ");
			//sc.nextLine();
			int action=sc.nextInt();
			switch(action) {
			case 1: 
					quit=true ;
					break;
			case 2: //System.out.println("Enter String ");
					sc.nextLine();
					String string=sc.nextLine();
					values.add(index,string);
					//System.out.println("After add to values"+ values.get(index));
					index++;
					break;
			}
		}
		return values;
	}
	
	public static void saveObject(ISaveable saveObject) {
		for(int i=0;i<saveObject.write().size();i++) {
			System.out.println("Saving "+ saveObject.write().get(i) + " to storage device");
		}
	}
	
	public static void loadObject(ISaveable objectToLoad) {
		//System.out.println("Load Object");
		ArrayList<String> values =readValues();
		objectToLoad.read(values);
	}
}
