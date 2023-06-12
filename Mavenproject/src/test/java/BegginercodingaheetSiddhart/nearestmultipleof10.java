package BegginercodingaheetSiddhart;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class nearestmultipleof10 {

	public static void main(String[] args) {
		/* Consecutive 3 times */
		// TODO Auto-generated method stub
		String s = "aabbbmd";
		String kl = "";
		char[] j = s.toCharArray();
		List<Character> l = new ArrayList<Character>();
		for (int i = 0; i <= j.length - 1; i++) {
			l.add(j[i]);
		}
		Set<Character> n = new HashSet<Character>(l);
		List<Character> k = new ArrayList<Character>(n);

		for (int k1 = 0; k1 <= k.size() - 1; k1++) {
			int count = 0;
			for (int p = 0; p <= l.size() - 1; p++) {
				if (k.get(k1) == l.get(p)) {
					count++;
					if (count == 3) {
						l.add(p + 1, 'd');

						System.out.println(l.get(p) + " " + "has come consecutive 3 times");
						break;
					}

				} else {
					count = 0;
				}

			}

		}
		for (int g = 0; g <= l.size() - 1; g++) {
            kl=kl+l.get(g);
		}
		
		System.out.println(kl);

	}

}
