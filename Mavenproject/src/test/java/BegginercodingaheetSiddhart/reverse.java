package BegginercodingaheetSiddhart;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 12345;
		String s = Integer.toString(x);
		String d = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			d = d + s.charAt(i);
		}
		int y = Integer.parseInt(d);
		x = y;
		System.out.println(x);

	}

}
