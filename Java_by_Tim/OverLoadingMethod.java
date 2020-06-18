public class OverLoadingMethod{
	public static void main(String args[])
	{	
		//OverLoadingMethod a=new OverLoadingMethod();
		calculate(3,12);
	}
	public static int calculate(int feet , int inches){
		if(feet >= 0 && inches>=0 && inches <=12){
			if(inches==12)
			{	
				feet++;
				inches=inches-12;
				System.out.println("feet "+feet +" inches "+inches);
				return 0;					
			}
		else 
			return 0;
		}
	}
}
