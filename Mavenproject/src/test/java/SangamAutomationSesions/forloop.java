package SangamAutomationSesions;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 && i < 20) {
				System.out.print(i + ",");
			}
			if (i == 20 && i % 2 == 0) {
				System.out.print(i);
			}
		}

	}

}
