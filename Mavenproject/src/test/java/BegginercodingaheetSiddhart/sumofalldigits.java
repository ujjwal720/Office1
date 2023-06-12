package BegginercodingaheetSiddhart;

import javax.print.attribute.IntegerSyntax;

public class sumofalldigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1234;
		int sum = 0;
		String s = Integer.toString(x);
		for (int i = 0; i <= s.length() - 1; i++) {
		Integer d=Integer.parseInt(Character.toString(s.charAt(i)));
			sum = sum + d;
		
		}

		System.out.println(sum);
         System.out.println(Integer.valueOf(x));
	}

}
