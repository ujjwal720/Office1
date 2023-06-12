package testng;

import java.util.ArrayList;
import java.util.List;

public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Sgiffle the array in the following
		 */

		int[] a_z = { 2, 5, 1, 3, 4, 7 };
		List<Integer> first = new ArrayList<Integer>();
		List<Integer> second = new ArrayList<Integer>();
		List<Integer> main_array = new ArrayList<Integer>();
		int half = a_z.length / 2;
		for (int i = 0; i <= a_z.length - 1; i++) {
			if (i <= half - 1) {

				first.add(a_z[i]);

			} else {

				second.add(a_z[i]);

			}

		}

		for (int k = 0; k <= first.size() - 1; k++) {

			main_array.add(first.get(k));
			main_array.add(second.get(k));

		}

		System.out.println(main_array);

	}

}
