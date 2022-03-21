/*

Given an array of size N whose elements will not be more than N-2, find the element whose duplicate exists.

there is only 1 element which is duplicate.

Time Complexity should be O(n)

For example given an array {0, 7, 1, 4, 5, 7, 2, 3, 6} the duplicate element is 7, so the output should be 7.

*/

public class findDuplicateArray {
	
	public static int duplicateNumber(int arr[]) {
		// create a tempArray
		int[] tempArray = new int[arr.length];
		
		for ( int i = 0 ; i < arr.length;i++) {
			tempArray[arr[i]]++;
		}
		
		for(int j = 0 ; j <tempArray.length;j++) {
			if ( tempArray[j] > 1) {
				return j;
			}
		}
		
		return -1;
		
    }

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 7, 4, 4, 5, 6 , 0};
		System.out.println(duplicateNumber(arr));

	}

}
