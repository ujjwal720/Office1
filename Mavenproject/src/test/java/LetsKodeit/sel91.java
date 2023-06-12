package LetsKodeit;

import java.util.ArrayList;
import java.util.List;

public class sel91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello welcome to rivet organization";
		String[] result = s.split(" ");
		String result2 = "";
		String result1 = "";
		List<String> io = new ArrayList<String>();

		for (int i = 0; i <= result.length - 1; i++) {

			result1 = "";

			String f_s = result[i];

			for (int j = 0; j <= f_s.length() - 1; j++) {

				if (j == 0) {

					result1 = result1 + Character.toUpperCase(f_s.charAt(0));

				} else {

					result1 = result1 + f_s.charAt(j);

				}

			}

			io.add(result1);

		}

		for (int i = 0; i <= io.size() - 1; i++) {
			
			
			result2=result2+io.get(i)+" ";
			
			

		}
		
		System.out.println(result2);

	}

}
