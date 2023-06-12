package SangamAutomationSesions;

public class sumoddigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1234;
		int sum = 0;
		while (a != 0) {
			int b = a % 10;
			sum = sum + b;
			a = a / 10;

		}
		
		System.out.println(sum);

	}

}
