
public class Vehicle {
	private String name;
	private String size;
	private int velocity;
	private int direction;
	
	
	public Vehicle(String name ,String size) {
		this.name=name;
		this.size=size;
		this.direction=0;
		this.velocity=0;
	}
	public void move(int velocity,int direction ) {
		this.direction=direction ;
		this.velocity=velocity;
		System.out.println("Vehicle.Move(): Moving at "+this.velocity+" in direction "+this.direction);
	}
	public void steering(int direction) {
		this.direction +=direction;
		System.out.println("Vehicle.steering(): steering at "+ this.direction+" degrees" );
	}
	public void stop() {
		this.velocity=0;
	}
	public int getCurrentVelocity() {
		return velocity;
	}
	public int getDirection() {
		return direction;
	}
}
