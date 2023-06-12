package trackit;

import java.util.HashSet;
import java.util.Set;

public class notchangeposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String h = "alphxxdida";
		StringBuilder z = new StringBuilder(h);
		String j = z.reverse().toString();
		Set<Character> m = new HashSet<Character>();
		for (int i = 0; i <= h.length() - 1; i++) {
			if (h.charAt(i) == j.charAt(i)) {
				m.add(h.charAt(i));
			}
		}

		System.out.println(m);
	}

}
