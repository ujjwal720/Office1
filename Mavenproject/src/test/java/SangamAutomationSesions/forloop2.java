package SangamAutomationSesions;

public class forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   m k=new m();
   System.out.println(k.m);
   k.jk();
		

	}

}

class m extends kl{
	
	
	
	public static void jk() {
		System.out.println("The following is an static method");
	
	}
	
	public void g() {
		super.v();
	}
	
}



class kl{
	
	static {
		System.out.println("This will execute");
	}
	
	static int m=10;
	
	public static void jk() {
		
	
		System.out.println("This is an static method");
	}
	
	static {
		System.out.println("This will be execute once");
	}
	
	static {
		System.out.println("This will execute");
	}
	
	public void v() {
		System.out.println("This follwoing is the method v");
	}
	public kl() {
		System.out.println("Default constructor");
	}
}