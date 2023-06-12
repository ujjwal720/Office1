package trackit;

public class occuranceofgiveinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Integer x = 123222;
		int y = 2;
		String z = Integer.toString(x);
		String w = Integer.toString(y);
		String[] a = z.split("");
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i].equals(w)) {
				count++;
			}
		}
		System.out.println("The digit" + " " + w + "occures" + " " + count + "Times");

	}

}
