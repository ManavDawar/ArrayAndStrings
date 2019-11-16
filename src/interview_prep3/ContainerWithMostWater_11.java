package interview_prep3;

public class ContainerWithMostWater_11 {
	public int maxArea(int[] arr) {
        int left = 0;
		int right = arr.length - 1;
		int area = 0;
		while (left < right) {
			if (arr[left] > arr[right]) {
				area = Math.max(area, arr[right] * (right - left));
				right--;
			} else if (arr[left] < arr[right]) {
				area = Math.max(area, arr[left] * (right - left));
				left++;

			} else {
				area = Math.max(area, arr[left] * (right - left));
				left++;
				right--;

			}
		}
		return area;

    }
}
