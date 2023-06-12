package testng;

public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		String[] b = a.split("");
		for (int i = 0; i <= a.length() - 1; i++) {
			String x = b[i];
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					System.out.print(x.toUpperCase());
				} else {
					System.out.print(x);
				}
			}
		}

	}

}
