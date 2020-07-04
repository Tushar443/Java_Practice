
public class DeskPhone  implements ITelephone{
	
	private int myNumber;
	private boolean isRinging;

	public DeskPhone(int myNumber) {
		this.myNumber=myNumber;
	}
	
	@Override
	public void powerOn() {
			System.out.println("Desk phone does not have a power button");
	}

	@Override
	public void dial(int phoneNumber) {
			System.out.println("Now Ringing "+ phoneNumber + " on  desk Phone");
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Anwsering the desk phone");
			isRinging=false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber ==myNumber) {
			isRinging=true;
			System.out.println("Ring Ring");
		}else {
			isRinging=false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}
	

}
