package interview_prep1;

public class LongPressedName_925 {

	public static void main(String[] args) {
		System.out.println(isLongPressedName("pyplrz", "ppyypllr"));
	}

	public static boolean isLongPressedName(String name, String typed) {

		if (name.length() == 0 || typed.length() == 0) {
			return false;
		}
		// 2 pointers used for 2 strings
		int indexname = 0;
		int indextype = 0;

		while (indexname < name.length()) {
			if (indextype >= typed.length()) {
				return false;
			}

			if (name.charAt(indexname) == typed.charAt(indextype)) {
				indexname++;
				indextype++;
			}

			else {
				if (indexname > 0 && indextype < typed.length()
						&& name.charAt(indexname - 1) == typed.charAt(indextype)) {
					indextype++;
				}else {
					return false;
				}
			}
		}
		return true;
	}
}
