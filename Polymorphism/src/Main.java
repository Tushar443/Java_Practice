
public class Main {
	public static void main(String[] args) {
//		Car c=new Car("Maruti-susuki",2);
//		c.accelrate(20);
//		c.carBreak(true);
		Car c=new Car("base car",8);
		c.startEngines();
		c.accelrate();
		c.carBreak();
		
		Marrazzo m=new Marrazzo(16);
		m.startEngines();
		m.accelrate();
		m.carBreak();
		

		Honda h=new Honda(12);
		h.startEngines();
		h.accelrate();
		h.carBreak();
	}
}
