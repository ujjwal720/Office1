package trackit;

public class situation extends eitogether implements a1,b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		situation k=new situation();//constructotor is evoked
		   k.o1();
		   k.o2();
		   k.p1();
		   k.p2();
		
	}

	@Override
	public void o1() {
		
		System.out.println("This is an 01");
	}

	@Override
	public void o2() {
		// TODO Auto-generated method stub
		System.out.println("the folowing is 02");
	}

	@Override
	public void p1() {
		// TODO Auto-generated method stub
		System.out.println("The following is p1");
	}

	@Override
	public void p2() {
		// TODO Auto-generated method stub
		System.out.println("The following is the p2");
	}

}
