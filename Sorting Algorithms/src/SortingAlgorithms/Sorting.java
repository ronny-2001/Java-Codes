package SortingAlgorithms;

public class Sorting {
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {6, 3, 9, 5, 2, 8, 1};
/*
		//Bubble Sort : Time Complexity : O(n^2)
		for(int i = 0; i < arr.length - 1; i++) {	//n-1
			for(int j = 0; j < arr.length - i - 1; j++) {	// j < arr.length - i - 1 : i because last element is getting sorted so we neglect that element or i increases with each iteration.s 
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
*/	
/*		
		//Selection Sort : Time Complexity : O(n^2)
		for(int i = 0; i < arr.length - 1; i++) {
			int smallest = i;	//storing the index of smallest element 
			for(int j = i + 1; j<arr.length; j++) {
				if(arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			
			//swap
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
*/		
		//Insertion Sort : Time Complexity : O(n^2)
		for(int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while(j >= 0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			
			//placement 
			arr[j + 1] = current;
		}
		
		printArray(arr);
	}
}