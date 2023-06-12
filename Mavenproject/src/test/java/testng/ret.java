package testng;

public class ret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(new gfg1().sub(0, 0).sum(1, 2));

	}

}

class gfg {

	public int sum(int a, int b) {
		int c = a + b;
		
		return c;

	}
}

class gfg1{
	
	public gfg sub(int a,int b) {
		int d=a-b;
		
		return new gfg();
		
	}
	
}
