package RahulShetty;

public class Camelcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stubString

		String s = "Ujjwal";
		int count = 0;
		char[] m = s.toCharArray();
		for (int i = 0; i <= m.length - 1; i++) {
			if (Character.isUpperCase(m[i])) {
				count++;
			}

		}
		System.out.println(count);

	}

}
