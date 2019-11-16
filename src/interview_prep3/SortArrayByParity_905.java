package interview_prep3;

public class SortArrayByParity_905 {

	  public int[] sortArrayByParity(int[] arr) {
		  int i = 0;
			int j = 0;
			while (i < arr.length && j < arr.length) {
				if (arr[j]%2 != 0) {
					j++;
				} else if (arr[j]%2 == 0) {
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
