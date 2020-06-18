
public class Car extends Vehicle {
		private int wheels;
		private int doors;
		private int gears;
		private boolean isManual;
		private int currentGear;
		
		
		public Car (String name,String size,int wheels,int doors,int gears,boolean isManual) {
			super(name,size);
			this.currentGear=1;
			this.doors=doors;
			this.gears=gears;
			this.isManual=isManual;
			this.wheels=wheels;
		}
		public void changeVelocity (int speed,int direction) {
			System.out.println("car.changeVelocity() : velocity "+ speed + " direction"+ direction);
			move(speed,direction);
					}
		
		public void changeGear(int currentGear) {
			System.out.println("car.setcurrentGear(): changed to " + currentGear+ " gear");
			this.currentGear=currentGear;
		}
		
}	
