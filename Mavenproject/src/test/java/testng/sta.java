package testng;

public class sta {

	static public void main(String[] args) {
		// TODO Auto-generated method stub

		re a = new re();
	}

}

class re {

	static int a = 1;
	int b=1;

	static {

		System.out.println("this is ans tatic block");
	}

	public re() {
		System.out.println("The following is an constructor");
	}

	public void count() {
		a++;
	}
}