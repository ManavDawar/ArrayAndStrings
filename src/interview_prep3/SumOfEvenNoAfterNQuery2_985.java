package interview_prep3;

public class SumOfEvenNoAfterNQuery2_985 {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int sum=0;
		for(int val:A) {
			if(val%2==0) {
				sum+=val;
			}
		}
		int[] ans=new int[queries.length];
		int i=0;
		for(int[] val:queries) {
			if(A[val[1]]%2==0) {
				sum-=A[val[1]];
			}
			A[val[1]]+=val[0];
			if(A[val[1]]%2==0) {
				sum+=A[val[1]];
			}
			ans[i]=sum;
			i++;
		}
		return ans;
	}
}
