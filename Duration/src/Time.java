
public class Time {
	public static void main(String[] args) {
		Time t=new Time();
		//t.getDuration(120, 2);
		t.getDuration(65,45);
	}
	public void getDuration(int min,int sec) {
	
		if(min>=0 && sec>=0 && sec<60) {
			if(min>=60) {
				int toHour=min/60;
				int toMin=sec/60;
				int toSec=sec%60;
				String hour =toHour + "h";
				if(toHour<10) {
					hour ="0"+hour;
				}
				String min1 =toMin + "m";
				if(toHour<10) {
					min1 ="0"+min1;
				}
				String sec1 =toSec + "s";
				if(toHour<10) {
					sec1 ="0"+sec1;
				}
				System.out.println(hour + " "+min1+" " + sec1);
			}
			else
				System.out.println( 0+ " hour " +min + " min "+ sec+" sec");
		}
		else
			System.out.println("Invalid");
	}
	public void getDuration(int sec) {
		if(sec>=0) {
			int toMin=sec/60;
			int toSec=sec%60;
			getDuration(toMin,toSec);
		}
		else
			System.out.println("Invalid");
	}
}

