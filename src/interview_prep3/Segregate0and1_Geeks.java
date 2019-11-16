package interview_prep3;

public class Segregate0and1_Geeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1 };
		int[] res=sort(arr);
		for(int val:res) {
			System.out.print(val+" ");
		}
	}

	public static int[] sort(int[] arr) {
		int i = 0;
		int j = 0;
		while (i < arr.length && j < arr.length) {
			if (arr[j] == 1) {
				j++;
			} else if (arr[j] == 0) {
				swap(arr, i, j);
				i++;
				j++;
			}
		}
		return arr;

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
