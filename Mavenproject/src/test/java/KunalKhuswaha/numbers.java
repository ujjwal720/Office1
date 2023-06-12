package KunalKhuswaha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int repeated=2;
		String s = "aaaaxxppppppbrwerwrwtttretttttttttttttttttttttttttttttttttttttbba";
		char[] x = s.toCharArray();
		List<Character> t = new ArrayList<Character>();
		for (int i = 0; i <= x.length - 1; i++) {
			t.add(x[i]);
		}
		Set<Character> y = new HashSet<Character>(t);
		List<Character> n = new ArrayList<Character>(y);
		List<Integer> counts = new ArrayList<Integer>();
		for (int j = 0; j <= y.size() - 1; j++) {
			int count = 0;
			for (int k = 0; k <= t.size() - 1; k++) {
				if (n.get(j) == t.get(k)) {
					count++;
				}

			}

			counts.add(count);

		}

		List<Integer> counts1 = new ArrayList<Integer>(counts);
		Collections.sort(counts1);

		for (int m = 0; m <= counts1.size() - 1; m++) {
			if (counts1.get(counts1.size() - repeated) == counts.get(m)) {
				System.out.println(n.get(m));
			}

		}

	}

}
