import java.util.*;
public class ArrayJavaChallenge{
	private static int []arr;
	public static void main(String [] args){
		//JavaChallenge jc=new JavaChallenge();		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of element\r");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the "+n+" elements\r");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();		
		}
		printArray(getInputInteger());
		System.out.println("Sorted");
		printArray(getSortInteger(arr));
		sc.close();
		
	}
	public static int[] getInputInteger(){
		return arr;
	}
	
	public static int [] getSortInteger(int [] arr){
		/* 
			for copy of Array using Array Class
			int [] sortedArray = Arrays.copyOf(arr,arr.length);
		*/
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j]){
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;				
				}
			}			
		}
		return arr;
	}
	public static void printArray(int [] arr){
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);	
	}
}
