import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class MobilePhone implements ITelephone{
	private int myNumber;
	private boolean isRinging;
	private boolean isOn=false;
	
	public MobilePhone(int myNumber) {
		this.myNumber=myNumber;
	}
	
	@Override
	public void powerOn() {
			this.isOn=true;
			System.out.println("Mobile phone powered up");
	}

	@Override
	public void dial(int phoneNumber) {
		if(isOn) {
			System.out.println("Now Ringing "+ phoneNumber + " on  Mobile Phone");
		}else {
			System.out.println("Phone is Switch off");
		}
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Anwsering the Mobile phone");
			isRinging=false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber ==myNumber && isOn) {
			isRinging=true;
			System.out.println("Melody Ring");
		}else {
			isRinging=false;
			System.out.println("Moblie phone is not on or number incorrect");
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}
	


}
