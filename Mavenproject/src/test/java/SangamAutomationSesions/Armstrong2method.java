package SangamAutomationSesions;

public class Armstrong2method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 153;
		int b=a;
		int sum = 0;
		while (a != 0) {
			int c = a % 10;
			sum = sum + (c * c * c);
			a=a/10;

		}
		System.out.println(sum);
		
		if(sum==b) {
			System.out.println("The following is armstrong number");
		}
		else {
			System.out.println("The following is not armstrong number");
		}

	}

}
