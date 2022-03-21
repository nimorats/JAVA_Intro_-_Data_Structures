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

	public static void main(String[] args) {
		int[] arr = new int[7];
		int[] result = arrange(arr, arr.length);
		for ( int i = 0 ; i < result.length;i++) {

			System.out.println(result[i]);
		}

	}

}
