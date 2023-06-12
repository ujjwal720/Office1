package pom2;



public class refrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		numbers a=new numbers();
		a.me().t(a);

		

	}

}

class numbers {
	int a = 10;
	int b = 20;
	
	public sum me() {
		
		return new sum();
	}
	
}

class sum {

	public void t(numbers a) {
		System.out.println(a.a+a.b);
	}
}