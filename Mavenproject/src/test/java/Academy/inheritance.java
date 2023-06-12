package Academy;

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		p a=new m();
		a.is();
	
	}

}


class m extends p{
	
	public void is() {
		System.out.println("The following is child class");
	}
	
}
	
	
 class p {

	int a;
	int b;

	public void is() {
		System.out.println("The following is parent class");
	}
	
	
}