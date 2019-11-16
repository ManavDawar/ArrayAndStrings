package interview_prep3;

public class Sort012_75 {
	public void sortColors(int[] nums) {

		int lo = 0, mid = 0, hi = nums.length - 1;
		while(mid<=hi) {
			if(nums[mid]==0) {
				swap(nums,lo,mid);
				lo++;
				mid++;
			}else if(nums[mid]==1) {
				mid++;
			}else {
				swap(nums,mid,hi);
				hi--;
			}
		}
		
	}
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
