package interview_prep3;

import java.util.Arrays;

public class BoatsToSavePeople_881 {
	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int i = 0;
		int j = people.length - 1;
		int rv = 0;
		while (i < j) {
			int sum = people[i] + people[j];
			if (sum <= limit) {
				rv++;
				i++;
				j--;
			}else {
				rv++;
				j--;
			}
		}
		if(i==j) {
			rv++;
		}
		return rv;
	}
}
