package testng;

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mt s=new mt();
	

	}

}

class mt{
	
private int balance=100;

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public void hellos() {
	System.out.println(balance);
}



	
	
}
