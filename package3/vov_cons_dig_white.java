package package3;

public class vov_cons_dig_white {
	public static void main(String[] args) {

		int dig_count = 0;
		int white_Space = 0;
		int vow_count = 0;
		int cons_count = 0;

		String s1 = "my password is 1234";
		for (int i = 0; i <= s1.length() - 1; i++) {
			if (Character.isDigit(s1.charAt(i))) {
				dig_count++;

			}

			else {

				if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
						|| s1.charAt(i) == 'u') {
					vow_count++;
				} else {
					if (Character.isWhitespace(s1.charAt(i))) {
						white_Space++;
					} else {
						cons_count++;
					}
				}
			}

		}

		System.out.println("total number of vowels:" + vow_count);
		System.out.println("total number of consonants:" + cons_count);
		System.out.println("total number of digits:" + dig_count);
		System.out.println("total number of spaces:" + white_Space);
	}
}
