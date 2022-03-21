// Given an array of size N, provided the size of the array will be 2M + 1 where M is the number in the array, find the unique element in the array.

/* For example -- > for input array [1, 1, 5, 4, 5, 7, 6, 7, 6] the output will be 4.

*/

// Time Complexity of this code is O(n)

public class FindUniqueArray {
	
	public static int findUnique(int[] arr){
		int max = Integer.MIN_VALUE;
		for (int a = 0 ;  a < arr.length; a++) {
			if(arr[a] > max) {
				max = arr[a];
			}
		}
		
		int[] tempArray = new int[(2 * max) + 1];
		for ( int i = 0; i <arr.length;i++) {
			tempArray[arr[i]]++;
		}
		
		for ( int j = 0 ; j < tempArray.length;j++) {
			if(tempArray[j] == 1) {
				return j;
			}
		}
		return -1;
		
    }

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6};
		System.out.println(findUnique(arr));

	}

}
