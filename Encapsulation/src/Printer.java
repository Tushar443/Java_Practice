
public class Printer {
	private int tonerLevel;
	private int pagesPrinted1;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		if(tonerLevel> -1 && tonerLevel<=100)
			this.duplex=duplex;
		else
			this.tonerLevel=-1;
		this.tonerLevel=tonerLevel;
		this.pagesPrinted1=0;
	}
	
	public int addToner(int tonerAmount) {
		if(tonerAmount >0 && tonerAmount<=100) {
			if(tonerAmount + this.tonerLevel >100) {
				return -1;
			}
			this.tonerLevel +=tonerAmount;
			return this.tonerLevel;
		}
		else
			return -1;
	}
	public int printPages(int pages) {
		int pagesToPrint =pages;
		if(this.duplex) {
			pagesToPrint=(pages/2)+(pages%2);
			System.out.println("Printing in Duplex Mode");
		}
		this.pagesPrinted1+=pagesToPrint;
		return pagesToPrint;
	}
	
	
	public int getpagesPrinted() {
		return pagesPrinted1;
	}
}
