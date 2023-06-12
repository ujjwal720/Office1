package trackit;

public class stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Company erp system
		 */

		int x = 64;
		if (x >= 30 && x <= 50) {
			System.out.println("D");
		} else if (x >= 51 && x <= 60) {
			System.out.println("C");

		}
		else if (x >= 61 && x <= 80) {
			System.out.println("B");

		}
		else if (x >= 81 && x <= 100) {
			System.out.println("A");

		}
		else {
			System.out.println("The following is an invalid number PlEase check again");
		}
		
	}

}
