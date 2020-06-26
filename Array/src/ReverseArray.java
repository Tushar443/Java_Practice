import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90};
		System.out.println("Array         "+ Arrays.toString(arr)); //to print array in one line.
		reverseArray(arr);
		System.out.println("Reverse Array "+ Arrays.toString(arr));
	}
	
	public static void reverseArray(int []arr) {
		int n =arr.length/2;
		int m=arr.length -1;
		int i=1;
		int j=0;
		int temp=0;
		while(n>=i) {
			//System.out.println("While"+n);
			temp=arr[j];
			arr[j]=arr[m];
			arr[m]=temp;
			j++;
			m--;
			i++;
		}
		
//		for(i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
	}
}
