
public class st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cd a=new cd();
		a.display(3);
		a.display(8);
		

	}

}


 class cd{

int rollno;
static String c="Laxmi";

public void display(int rollno) {
	
this.rollno=rollno;

System.out.println("My roll no is" + rollno+ c);
	
}

}