package SangamAutomationSesions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Armstrong number=sum of cubes of indivitual number is equal to number eg-153
		
		int a=153;
		int sum=0;
		String b=Integer.toString(a);
		
		for(int i=0;i<=b.length()-1;i++) {
		int d=Integer.parseInt(Character.toString(b.charAt(i)));
		sum =sum+(d*d*d);
		}
		
		System.out.println(sum);
		
		if(sum==a) {
			System.out.println("The following is Armstrong Number");
		}
		else {
			System.out.println("The following is not an armstrong number");
		}

	}

}
