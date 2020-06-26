
import java.util.*;
public class ResizeArray {
	private static int[]arr=new int[10];
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the 10 elements");
		getInput();
		printArray();
		resizeArray();
		System.out.println("After resize "+arr.length);
		arr[10]=45;
		arr[11]=56;
		printArray();
	}
	
	public static void getInput() {
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	public static void printArray() {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
	}
	public static void resizeArray() {
		int []original=arr;
		arr=new int[12];
		for(int i=0;i<original.length;i++) {
			arr[i]=original[i];
		}
	}
}
