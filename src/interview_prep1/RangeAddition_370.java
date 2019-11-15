package interview_prep1;

public class RangeAddition_370 {

	public int[] getModifiedArray(int length, int[][] updates) {
		// Write your code here
		 if(length==0){
	            return new int[1];
	        }
	        int[] arr = new int[length + 1];

			for (int[] val : updates) {
				arr[val[0]] += val[2];
				arr[val[1]+1]-=val[2];
			}
			int[] rarr=new int[length];
			rarr[0]=arr[0];
			for(int i=1;i<rarr.length;i++) {
				rarr[i]=rarr[i-1]+arr[i];
			}
			return rarr;
	}

	public static void main(String[] args) {
	
		
	}

}
