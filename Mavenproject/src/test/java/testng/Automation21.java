package testng;

import java.util.ArrayList;
import java.util.List;

public class Automation21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5 };
		List<Integer> c = new ArrayList<Integer>();
		/*
		 * running sum of it
		 */

		for (int i = 0; i <= a.length - 1; i++) {

			int sum = 0;

			for (int j = 0; j <= i; j++) {

				sum = sum + a[j];

			}

			c.add(sum);

		}

		System.out.println(c);

	}

}
