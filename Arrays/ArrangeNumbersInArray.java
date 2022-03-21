// Given an empty array and its size n, fill the array with numbers 1 to N in the following way :--> [1, 3, 5 .... , 6, 4, 2]

// Input the sizr of the array N For example --> 6

// Output should be a populated array of size N. For example ( using above value of N) [ 1, 3, 5, 6, 4, 2]


import java.util.Scanner;

public class ArrangeNumbersInArray {

	public static int[] arrange(int[] arr, int n) {

		
		int startPointer = 0;
		int endPointer = n - 1;
		int i = 1;
		while( startPointer < endPointer){
			arr[startPointer] = i;
			startPointer++;
			i++;
			arr[endPointer] = i;
			endPointer--;
			i++;
		}

		if(n%2!=0) {
			arr[n/2] = n;
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		
		for ( int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		int[] result = arrange(arr, N);
		printArray(result);
		sc.close();

	}

}
