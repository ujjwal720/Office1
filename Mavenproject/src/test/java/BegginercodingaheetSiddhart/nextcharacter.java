package BegginercodingaheetSiddhart;

public class nextcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String capital = "";
		String s = "Abcabcmfwq";
		char[] m = s.toCharArray();
		for (int i = 0; i <= m.length - 1; i++) {
			char chars = m[i];
			chars++;
			capital = capital + chars;

		}
		System.out.println(capital);

	}

}
