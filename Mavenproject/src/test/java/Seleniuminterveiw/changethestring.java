package Seleniuminterveiw;

public class changethestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Abcd";
		String h = "";
		if (Character.isUpperCase(s.charAt(0))) {

			for (int i = 0; i <= s.length() - 1; i++) {

				h = h + Character.toUpperCase(s.charAt(i));
			}

		}

		else {

			for (int i = 0; i <= s.length() - 1; i++) {

				h = h + Character.toLowerCase(s.charAt(i));
			}
		}

		System.out.println(h);

	}

}
