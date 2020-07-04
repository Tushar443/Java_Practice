import java.util.ArrayList;

public class GearBox {
	private ArrayList<Gear> gears;
	private int currentGear=0; // private int gearNumber=0;  if it is gearNumber then it will have no issue but it will create to much confusion so we replace wtih currentGear.
	private int maxGears;		
	   						
	private boolean clutchIsIn;
	
	public GearBox(int maxGears) {
		this.maxGears=maxGears;
		this.gears=new ArrayList<>();
		//Gear neutral = new Gear(0,0.0);
		//this.gears.add(neutral);
		
		for(int i=0;i<maxGears;i++) {
			addGear(i,i*5.3);
		}
	}
	
	public void operateClutch(boolean in) {
		this.clutchIsIn=in;
	}
	
	public void addGear(int number,double ratio) {
//		System.out.println(number +" "+ ratio);
		if(number >=0 && number<= maxGears) {
			this.gears.add(new Gear(number,ratio));
		}
	}
	
	public double wheelSpeed(int revs) {
		if(clutchIsIn) {
			System.out.println("Scream!!");
			return 0.0;
		}else {
			return revs *gears.get(currentGear).getRatio();
		}
	}
	
	public void changeGear(int newGear) {
		if(newGear>=0 && newGear<=this.gears.size() && this.clutchIsIn) {
			this.currentGear=newGear;
			System.out.println("Gear " +newGear+" selected");
		}else {
			System.out.println("Grind");
			this.currentGear=0;
		}
	}
	
	private class Gear{
		private int gearNumber;
		private double ratio;
		
		public Gear (int gearNumber,double ratio) {
//			System.out.println("Gear class+++++++++++++++++++++++++++++");
//			System.out.println(gearNumber + " "+ ratio);
			 
			this.gearNumber=gearNumber;  //This is a inner class gearNumber that is on line 16.
			this.ratio=ratio;            // not on line 7.
			// if we want to accese outer class gearNumber then syntax will be ==>GearBox.this.gearNumber.
		}
		
		
		public double driveSpeed(int revs) {
			return revs*(this.getRatio());
		}


		public double getRatio() {
			return ratio;
		}
		
	}
}
