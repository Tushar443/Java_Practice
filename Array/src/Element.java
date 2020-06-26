import java.util.*;
public class Element {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number of element = ");
		int n =sc.nextInt();
		int [] arr=readInteger(n);
		int min=findMin(arr);
		System.out.println("Minimum Number is "+min);
		sc.close();
	}
	public static int[] readInteger(int n) {
		int []arr= new int[n];
		System.out.println("Enter the "+ n + " elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int findMin(int []arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
}
