
public class Main {
	 public static void main(String[] args) {
		ITelephone tp;    //if we used here DeskPhone tp it will only for DeskPhone not 
						// for MobilePhone and it will give you error.
		tp=new DeskPhone(1234);
		tp.powerOn();
		tp.callPhone(1234);
		tp.answer();
		
		tp=new MobilePhone(9876); //error on this line.
		tp.powerOn();
		tp.callPhone(9876);
		tp.answer();
	}
}
