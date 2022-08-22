package array;

import java.util.Scanner;

public class arrayMain{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter the size of Array:");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		
		//for enter the element in the array
		System.out.println("Enter the Element in the array:");
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=scan.nextInt();
		}
		
		//Calling the method 'printArray' to print the whole Array
		printArray(arr);
		System.out.println();
		
		//Calling 'sumOfElements' and 'largestElement' method inside the parentheses 
		System.out.println("\nSum of the elements of the Array is: "+sumOfElements(arr)+"\n");
		System.out.println("Largest element present in the Array is:"+largestElement(arr));
		
	}
	
	
	//To Print the element present in the array
	public static void printArray(int a[]) {
		System.out.print("\nElement Present in the Array are: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	//To Sum the element of the array
	public static int sumOfElements(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	//For finding largest element present in the array
	public static int largestElement(int a[]) {
		int largest=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		return largest;
	}
}