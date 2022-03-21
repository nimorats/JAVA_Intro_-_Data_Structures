// Swap elements of array

// Input will be a simple even numbered array to the function and it will return the array.

// For example --> [1, 5, 3, 7, 2, 65, 8, 9] upon execution of this input we should get output [5, 1, 7, 3, 65, 2, 9, 8] 

public class SwapAlternateArray {

	public static int[] swapAlternate(int arr[]) {
		for (int i = 0 ; i < arr.length;i = i + 2) {

			int j = i + 1;
			int temp;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}

	public static void printArray(int[] arr) {

		for ( int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		// Hardcoded values for ease of testing
		int arr[] = { 1, 2, 3, 4, 5, 6, 0, 10};
		int result[] = swapAlternate(arr);
		printArray(result);

	}

}
