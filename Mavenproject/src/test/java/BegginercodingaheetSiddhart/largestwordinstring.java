package BegginercodingaheetSiddhart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class largestwordinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "India is myfhfhfhfhfhfhfhfhfhfh country";
		String[] d = s.split(" ");
		List<Integer> n = new ArrayList<Integer>();

		for (int i = 0; i <= d.length - 1; i++) {
			n.add(d[i].length());
		}

		List<Integer> o = new ArrayList<Integer>(n);
		Collections.sort(o);
		for (int j = 0; j <= n.size() - 1; j++) {
			if (o.get(o.size() - 1) == n.get(j)) {
				System.out.println(d[j]);
			}
		}
	}

}
