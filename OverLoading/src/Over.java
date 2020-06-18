
public class Over {
		public static void main(String args[])
		{	
			Over a=new Over();
			//calculate(3,12); used static method for this
			a.calculate(8,4);
		}
		public void calculate(int feet , int inches){
			double cent = 0;
			if(feet >= 0 && inches>=0 && inches <=12){
				if(inches==12)
				{	
					feet++;
					inches=inches-12;
				}
				feet *=12;
				inches=inches+feet;
				cent=inches*2.54;
			}
			else { System.out.println("Invalid");
					return;
				}
			
			System.out.println("Centimeters "+cent);
		}
			
		public void calculate(int inches) {
			if(inches >=0) {
				int x=inches/12;
				int y=inches%12;
				
				calculate(x,y);
				//System.out.println("feet "+ x + " inches "+y );
			}
		}
	}
