public class slectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 99, 100, 50, 60, 29 };

		slectionsort(arr);

	}

	public static void slectionsort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minindex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minindex]) {
					minindex = j;
				}
				
			}
			int temp = arr[i];
			arr[i] = arr[minindex];
			arr[minindex] = temp;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
