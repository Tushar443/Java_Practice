import java.util.Scanner;
// It is local class example
public class ButtonMain {
	private static Scanner scanner =new Scanner (System.in);
	private static Button btnPrint=new Button("Print");
	
	public static void main(String[] args) {
		
//		class ClickListener implements Button.onClickListener{
//			
//			public ClickListener() {
//				System.out.println("I have been attached");
//			}
//			
//			@Override
//			public void onClick(String title) {
//				System.out.println(title +" was clicked");
//			}	
//		}
		//btnPrint.setOnClickListener(new ClickListener());
// Anonymous Function Synntax
		
		btnPrint.setOnClickListener(new Button.onClickListener() {
			
			@Override
			public void onClick(String title) {
				System.out.println(title +" was clicked");		
			}
		});
		listen();
	}
	
	private static void listen() {
		boolean quit =false;
		while (!quit) {
			int choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0:
					quit =true;
					break;
			case 1:
					btnPrint.onClick();
					break;
			}
		}
	}
}
