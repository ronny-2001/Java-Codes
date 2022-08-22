package SortingAlgorithms;

public class MergeSort {
	
	//Time Complexity : O(n logn)
	public static void conquer(int[] arr, int si, int mid, int ei) {
		int[] merged = new int[ei - si + 1]; //created new array of size [end - start + 1]
		
		int idx1 = si; //tracking first array
		int idx2 = mid+1; //tracking second array
		int x = 0;	//tracking merged array index
		
		//O(n)
		while(idx1 <= mid && idx2 <= ei) {  //comparing only when both arrays are not sorted 
			if(arr[idx1] <= arr[idx2]) {	//if element of first array is smaller than second array
				merged[x++] = arr[idx1++];	//then we put that element in newly created merged array
//				x++;
//				idx1++
			}
			else {
				merged[x++] = arr[idx2++];	//else we put element of second array in newly created merged array
			}
		}
		
		//what if one array is sorted but 2nd one is remaining
		while(idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		
		while(idx2 <= ei) {
			merged[x++] = arr[idx2++];
		}
		
		//copying merged array into original array
		for(int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}
	}
	
	//O(log n)
	public static void divide(int[] arr, int si, int ei) {
		if(si >= ei) {	//if staring index is greater or equal to ending index it means array contain only 1 element. 
			return;
		}
		
		int mid = si + (ei - si) / 2;
		divide(arr, si, mid);
		divide(arr, mid + 1, ei);
		
		conquer(arr, si, mid, ei);
	}
	
	
	public static void main(String[] args) {
		int[] array = {6, 3, 9, 5, 2, 8, 1};
		
		int n = array.length;
		divide(array, 0, n - 1);
		
		//print
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}
}