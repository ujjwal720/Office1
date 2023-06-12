package testng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class allappearbeforeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Check if every a apper before b
		 */

		List<Character> u = new ArrayList<Character>();
		String a_z = "abab";
		String actual = "";
		char[] resultant = a_z.toCharArray();
		for (int i = 0; i <= resultant.length - 1; i++) {

			u.add(resultant[i]);

		}

		Collections.sort(u);

		for (int j = 0; j <= u.size() - 1; j++) {

			actual = actual + u.get(j);

		}

		if (actual.equals(a_z)) {

			System.out.println("All a come before b");

		}

		else {

			System.out.println("Not all a are before b");

		}

	}

}
