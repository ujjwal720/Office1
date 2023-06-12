package testng;

public class re1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m a=new m();
	    a.ms();
	}

}


class m{
	
	public d ms() {
		
		System.out.println("This is an ms");
		return new d();
	}
	public m() {
		System.out.println("This is an m");
	}
	
}

class d{
	public  void ms1() {
		System.out.println("this is ms2");
		
	}
	public d(){
		System.out.println("This is d");
	}
}