
public class LiteralsString {
	public static void main(String[] args) {
		String s1 ="Tushar";
		String s2 ="Tushar";
		String s3 ="Rohit";
		String s4 ="tushar";
		String s5 ="Hello,World";
		System.out.println("Literals string");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println("#####################");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println("\nString using New KeyWord");
		s1 =new String("Thunder");
		s2 =new String("Rohit");
		s3 =new String("Rohit");
		s4 =new String("thunder");
		


		System.out.println("###################");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		
		
	}
}
