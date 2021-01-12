package practiseweek9;
import java.util.*;
public class Q1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("input the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();  }
		System.out.println("enter the sum");
		int sum=sc.nextInt();
		for(int i=0;i<arr.length-2;i++) { 
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) 
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
				}
			}
		}
	}
}