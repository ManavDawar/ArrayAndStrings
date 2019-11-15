package interview_prep1;

import java.util.Scanner;

public class MaxRangeQueries_CodeChef {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		int t=scn.nextInt();
		
		while(t-->0) {
			int c=100000;
			int n =scn.nextInt();
			int k=scn.nextInt();
			int[][] updates=new int[n][2];
			int arr[]=new int[c+1];
			for(int i=0;i<n;i++) {
				int l=scn.nextInt();
				int r=scn.nextInt();
				updates[i][0]=l;
				updates[i][1]=r;
				arr[l]+=1;
				arr[r+1]-=1;
			}
			int[] rarr=new int[c];
			rarr[0]=arr[0];
			for(int i=1;i<rarr.length;i++) {
				rarr[i]=rarr[i-1]+arr[i];
			}
			
			int[] kcount=new int[c];
			int[] k1count=new int[c];
			
			if(rarr[0]==k) {
				kcount[0]+=1;
			}
			if(rarr[0]==k+1) {
				k1count[0]+=1;
			}
			for(int i=1;i<rarr.length;i++) {
				if(rarr[i]==k) {
					kcount[i]=kcount[i-1]+1;
				}
				if(rarr[i]==k+1) {
					k1count[i]=k1count[i-1]+1;
				}
			}
			int max=0;
			for(int i=0;i<updates.length;i++) {
				max=Math.max(max, kcount[n-1]+
								  (k1count[updates[i][1]]-k1count[updates[i][0]])-
								  (kcount[updates[i][1]]-kcount[updates[i][0]]));
			}
			
			System.out.println(max);
		}
	}
}
