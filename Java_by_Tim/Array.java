import java.util.*;
public class Array {
	public static void main(String [] args){
		int []arr =new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int i=0 ;i<arr.length;i++)
			System.out.println(arr[i]);

		int [] arr2={100,200,300};
		for(int i=0;i<arr2.length;i++)
			arr2[i]=i*1000;
		for(int i=0 ;i<arr2.length;i++)
			System.out.println(arr2[i]);	

		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr3=new int[n];
		System.out.println("Enter the "+n +" numbers");
		for(int i=0;i<arr3.length;i++)
			arr3[i]=sc.nextInt();
		System.out.println("Result is ");
		for(int i=0 ;i<arr3.length;i++)
			System.out.println(arr3[i]);
        
	}
}
