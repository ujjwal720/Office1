package ShammiTestNg;

public class abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcdefg";
		String s2 = "abcd f";
		String h = "";
		String l = "";
		String m = "";

		if (s1.length() > s2.length()) {
			h = s1;
			l = s2;
		} else {
			h = s2;
			l = s1;

		}

		for (int i = 0; i <= h.length() - 1; i++) {
			if (h.charAt(i) == l.charAt(i)) {
				m = m + h.charAt(i);
			}
			else {
				System.out.println(m);
				break;
			}
		}

	}

}
