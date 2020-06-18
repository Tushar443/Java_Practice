//constructor OverLoading

public class VipCoustomer{

	public static void main(String [] args){
		VIP v=new VIP("Tushar",2000,"moretushart33@gmail.com");
		System.out.println(" Name "+v.getName() +"\n Creadit Limit = "+ v.getCreadit() + "\n Email ID is "+v.getEmailID() );	
	}
}

public class VIP{
	private String name;
	private double creaditLimit;
	private String emailID;
	

	public VIP(){
		this("Default",0,"default@gmail.com");
	}
	public VIP (String name,double creaditLimit){
		this(name,creaditLimit,"Defalut@gmail.com");
	}
	public VIP(String name,double creaditLimit,String emailID){
		this.name=name;
		this.creaditLimit=creaditLimit;
		this.emailID=emailID;
	}
	public String getName(){
		return name;
	}
	public String getEmailID(){
		return emailID;
	}
	public double getCreadit(){
		return creaditLimit;
	}
}
