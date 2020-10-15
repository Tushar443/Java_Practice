
public class StringMethods {

	public static void main(String[] args) {
		String s ="This is my 1st String.";
		String s1="abc";
		String s2 ="Abc";
//		System.out.println(s.toLowerCase());
//		System.out.println(s.toUpperCase());
//		System.out.println(s.indexOf("m"));
//		System.out.println(s.lastIndexOf("g"));
//		System.out.println(s.length());
//		System.out.println(s.substring(11));
//		System.out.println(s.substring(8, 13));
		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3[]=s.split(" ");
		for(String s11 : s3) {
			System.out.println(s11);
		}
		
		

	}

}
