import java.util.*;

public class AutoBoxing {
	public static void main(String[] args) {
		String [] stringArray=new String[10];
		int [] intArray=new int[10];
		ArrayList<String> StringList=new ArrayList<String>();
		StringList.add("Tushar");
		
	//	ArrayList<int> IntList=new ArrayList<int>(); //error :-int is not a class 
		//ArryaList is not work with primitive data types. 
		ArrayList<Integer> IntList=new ArrayList<Integer>();
		
		IntList.add(Integer.valueOf(12));  //it is called Auto Boxing.
		IntList.add(Integer.valueOf(23));
		IntList.add(Integer.valueOf(56));
		for(int i=0;i<IntList.size();i++) {
			System.out.println("list = " +  IntList.get(i).intValue()); // it is called UnBoxing.
		}
		
		Integer myIntValue=56; //after compilation this code is look like this
							  // Integer myIntValue=Integer.valueof(56);
		
		int myInt=myIntValue; // int myInt =myIntValue.intValue();
		//@# Double 
//		ArrayList<Double> doubleList =new ArrayList<Double>();
//		doubleList.add(12.45);
//		doubleList.add(34.56);
//		doubleList.add(76.8);
//		
//		for(int i=0;i<doubleList.size();i++) {
//			System.out.println("list = " +  doubleList.get(i));
//		}
//		
//		ArrayList<noAutoBoxing> intClass=new ArrayList<noAutoBoxing>();
//		intClass.add(new noAutoBoxing(23));
//		System.out.println(" 1st element "+intClass.get(0).getMyValue());
	}
}
class noAutoBoxing {
	private int myValue;
	
	public noAutoBoxing(int myValue) {
		this.myValue=myValue;
	}
	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
}
